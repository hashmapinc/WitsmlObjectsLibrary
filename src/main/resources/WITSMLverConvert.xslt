<xsl:transform xmlns:w131="http://www.witsml.org/schemas/131" xmlns:w141="http://www.witsml.org/schemas/1series" xmlns:prodml="http://www.prodml.org/schemas/1series" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:diff="http://www.posc.org/schemas/schemaDiff" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1">
	<xsl:output method="xml" media-type="text/xml" encoding="utf-8" indent="yes"/>
	<!-- ==================================================================== -->
	<!-- Input parameters. -->
	<!-- Path (without the trailing slash) to the folder containing the schema xsd files for the 'to' namespace. -->
	<!--	This will be added to the schemaLocation in the output XML message. -->
	<!--	The default is the 'to' namespace. -->
	<xsl:param name="schemaLocationPath"/>
	<!-- Path (without the trailing slash) to the folder containing the schema xsd files for the 'to' PRODML namespace. -->
	<!--	This will be added to the schemaLocation in the output XML message. -->
	<!--	The default is the above schemaLocationPath namespace.  -->
	<xsl:param name="schemaLocationPathPRODML"/>
	<!-- The time zone when v131 is the "from" schema (i.e., for forward conversions). -->
	<!-- Timestamp values which do not have a time zone will be modified to  have this value.-->
	<!-- Must be of the form "Z" or "+hh.mm" or "-hh.mm" (not checked). -->
	<!-- USE WITH CARE! Probably only useful with a known server or client that always uses local time. -->
	<!-- Not used in a backward conversion.  -->
	<!-- The default is to not modify the date-time values in a forward conversion. -->
	<xsl:param name="v131TimeZone"/>
	<!-- A value of YES will result in comments NOT being inserted when elements and attributes are ADDED, DELETED, CHANGED, CONVERTED or RENAMED. -->
	<!-- The default is to add comments.  -->
	<xsl:param name="omitComment"/>
	<!-- A value of YES will result in the documentInfo section being eliminated. -->
	<!-- The default is to retain documentInfo.  -->
	<xsl:param name="dropDocumentInfo"/>
	<!-- The following mode values are recognized:
		read   - The XML represents a read template.    In a forward transform, new mandatory items will NOT be added.
		write  - The XML represents a write template.   In a forward transform, new mandatory items will be added with a value.
		update - The XML represents an update template. In a forward transform, a WARNING message will be generated on 
			 an element to which a new uid attribute has been added.
		delete - The XML represents an delete template. In a forward transform, a WARNING message will be generated on 
			 an element to which a new uid attribute has been added.
		Note that critical meta-data (e.g., columnIndex, mnemonicList) will always be converted regardless of the mode.
	 -->
	<!-- The default assumes a write template. That is, the result will be schema compliant against the normative schema.  -->
	<xsl:param name="mode">write</xsl:param>
	<!-- A value of YES will omit the banner declaring the time of conversion and the input parameters. -->
	<!-- The default is to add the banner.  -->
	<xsl:param name="omit-banner"/>
	<!-- Date-time of the request. -->
	<!-- A non-null value will insert the specified value into the the banner. -->
	<xsl:param name="request-date"/>
	<!-- ============================================================== -->
	<!-- This script assumes:
	1) The input file represents an XML file in the 'from' schema (based on its namespace).
	2) The root element is the plural object (i.e., with appended 's').
	3) All uom attributes are populated and unit conversion is not necessary.
	4) A program such as HTML Tidy will be run to indent the output (if desired).
	   A line break is generated after each element and at the beginning of each element container.
	5) Custom data can be copied in its same namespace.
	6) All v1.3.1.1 timestamp values have a timezone. See parameter "v131TimeZone" above.
	7) The log data has the index curve first.
-->
	<!-- ============================================================== -->
	<!-- Assumptions specific a FORWARD transform from v1.3.1.1 to v1.4.1

     The following data will be lost.
	1) The @datum attribute in the following elements:
		mdDelta
		tvdDelta
		mdWater
		waterDepth
	2) dataRowCount
	3) @defaultMeasuredDepth, @defaultVerticalDepth, @defaultElevation from wellDatum.
	4) Note that logData v1.4.1 requires the index curve to be first.
	5) trajectoryStation/modelToolError. 
	6) trajectoryStation/customData. 
	7) geologyInterval/lithology/matrixCement (if they do not conform to enumerated values).
	8) wellLog/logCurveInfo/encodingDef is not supported in log. The data will need to be converted to use typeLogData.
-->
	<!-- ==================================================================== -->
	<!-- Assumptions specific to a BACKWARD transform from v1.4.1 to v1.3.1.1.

     The following data will be lost when converting from v1.4.1 to v1.3.1.1.
	 1) All new v1.4.1 elements and attributes (except serviceCategory).
	    A comment will be created for each deleted item. 
	    This includes the following:
		extensionNameValue
		extensionAny
		dataDelimiter
		dataUpateRate
		dataGroup
		serviceCategory
		acquisitionTimeZone
		classIndex
		curveSensorsAligned
		dTimHeaderLastChanged
		codeMfg
		mudClass
		proprietaryCode
		stateDetailActivity
		depthRegistrationData
		magneticDeclination
		gridConvergence
		mapProjectionCRS
		geodeticCRS
		datumCRS
		horizontalLocation
		wellPublicLandSurveySystemLocation
		eventType
		tqYield
		dTimCreation		(parent element=commonTime)
		dTimLastChange		(parent element=commonTime)
		mdBit			(parent element=wellbore)
		tvdBit			(parent element=wellbore)
		isActive		(parent element=wellbore)
		tvd			(parent element=fluid)
		presBopRating		(parent element=fluid)
		md			(parent element=activity)
		tvd			(parent element=activity)
		@namingSystem		(parent element=logCurveInfo/mnemonic)
		@namingSystem		(parent element=logCurveInfo/mnemAlias)
		@uid			(parent element=log/logParam)
		@uid			(parent element=attachment/param)
		@uid			(parent element=message/param)
		@uid			(parent element=wellLog/logParam)
		@uid			(parent element=projectionx/parameter)
		@uid			(parent element=rigResponse/anchorTension)
		@uid			(parent element=bitRecord)
		@uid			(parent element=event)
		@uid			(parent element=securityInformation)
		defaultDatum		(parent element=commonData)
		privateGroupOnly	(parent element=commonData)
		stnGridConUsed		(parent element=trajectoryStation/corUsed)
		gridConUsed		(parent element=trajectoryStation)
		typeLogData		(specialized kinds changed to "double" or "string")
	OBJECT=dtsMeasurement
		dTim
		dTimMin
		dTimMax
		dTimCurrent
		wellContext
		processedLog
-->
	<!-- Global variables. -->
	<!-- relative versions. -->
	<xsl:variable name="oldVersion">http://www.witsml.org/schemas/131</xsl:variable>
	<xsl:variable name="newVersion">http://www.witsml.org/schemas/1series</xsl:variable>
	<xsl:variable name="prodmlNamespace">http://www.prodml.org/schemas/1series</xsl:variable>
	<!-- The name of the singular input object. -->
	<xsl:variable name="object">
		<!-- Get everything but the "s" from the plural. -->
		<xsl:value-of select="substring(name(./child::*[1]),1,string-length(name(./child::*[1]))-1)"/>
	</xsl:variable>
	<!-- The conversion direction. -->
	<xsl:variable name="direction">
		<xsl:for-each select="/child::*">
			<xsl:choose>
				<xsl:when test="namespace-uri() = $prodmlNamespace and ($object='dtsMeasurement' or $object='dtsInstalledSystem')">backward</xsl:when>
				<xsl:when test="namespace-uri() = $oldVersion">forward</xsl:when>
				<xsl:when test="namespace-uri() = $newVersion">backward</xsl:when>
				<xsl:otherwise>UNKNOWN</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
	</xsl:variable>
	<!-- The name of the singular output object. -->
	<xsl:variable name="objectOut">
		<xsl:choose>
			<xsl:when test="$direction='forward' and $object='wellLog'">log</xsl:when>
			<xsl:when test="$direction='forward' and $object='trajectoryStation'">trajectory</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$object"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<!-- Namespace for the new schema. -->
	<xsl:variable name="newNameSpace">
		<xsl:choose>
			<xsl:when test="$direction='forward' and ($object='dtsMeasurement' or $object='dtsInstalledSystem')">
				<xsl:value-of select="$prodmlNamespace"/>
			</xsl:when>
			<xsl:when test="$direction='forward'">
				<xsl:value-of select="$newVersion"/>
			</xsl:when>
			<xsl:when test="$direction='backward'">
				<xsl:value-of select="$oldVersion"/>
			</xsl:when>
			<xsl:otherwise>UNKNOWN</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<!-- Version of the new schema. -->
	<xsl:variable name="version">
		<xsl:choose>
			<xsl:when test="$direction='forward' and ($object='dtsMeasurement' or $object='dtsInstalledSystem')">1.2.0.0(PRODML)</xsl:when>
			<xsl:when test="$direction='backward' and $object='stimJob'">1.0.0.0(stimJob)</xsl:when>
			<xsl:when test="$direction='forward'">1.4.1.1</xsl:when>
			<xsl:when test="$direction='backward'">1.3.1.1</xsl:when>
			<xsl:otherwise>UNKNOWN</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<!-- schemaLocation of the new schema. -->
	<xsl:variable name="schemaLocation">
		<xsl:value-of select="$newNameSpace"/>
		<xsl:text> </xsl:text>
		<xsl:choose>
			<xsl:when test="$schemaLocationPathPRODML!='' and $newNameSpace=$prodmlNamespace">
				<xsl:value-of select="translate($schemaLocationPathPRODML,'\','/')"/>
			</xsl:when>
			<xsl:when test="$schemaLocationPath!=''">
				<xsl:value-of select="translate($schemaLocationPath,'\','/')"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$newNameSpace"/>
			</xsl:otherwise>
		</xsl:choose>
		<xsl:text>/obj_</xsl:text>
		<xsl:value-of select="$objectOut"/>
		<xsl:text>.xsd</xsl:text>
	</xsl:variable>
	<!-- Start here. -->

    	<!-- Riegel, 08/16/2012, 131 trajStation.statusTrajStation supports values of valid and locked -->
    	<!-- 141x does not, so change to unknown. -->
    	<xsl:template match="*" mode="copy-statusTrajStation-Forward">
        	<!-- The matrixCement values are controlled in v141. -->
        	<xsl:variable name="lowerValue">
            	<xsl:value-of select="translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')"/>
        	</xsl:variable>
        	<xsl:choose>
            	<!-- Null value is probably a template. -->
            	<xsl:when test=".=''"/>
            	<xsl:when test="$lowerValue='valid' or $lowerValue='locked'">
                	<xsl:value-of select="'unknown'"/>
            	</xsl:when>
        	</xsl:choose>
    	</xsl:template> 
	
	<xsl:template match="/ | comment()">
		<xsl:choose>
			<xsl:when test="$direction='UNKNOWN'">
				<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
				<xsl:comment> The namespace='<xsl:value-of select="namespace-uri()"/>' is not recognized. </xsl:comment>
				<xsl:comment> No conversion was applied. That is, the input was copied to the output. </xsl:comment>
				<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
				<xsl:copy-of select="/child::* | comment()"/>
			</xsl:when>
			<xsl:when test="$object='attachment' or
				$object='changeLog' or 
				$object='coordinateReferenceSystem' or
				$object='drillReport' or
				$object='toolErrorTermSet' or
				$object='toolErrorModel' or
				$object='realtime' or
				$object='objectGroup'">
				<!-- This object does not exist in the both versions. Copy as is. -->
				<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
				<xsl:comment> A conversion for object='<xsl:value-of select="$object"/>' is not supported. </xsl:comment>
				<xsl:comment> No conversion was applied. That is, the input was copied to the output. </xsl:comment>
				<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
				<xsl:copy-of select="/child::* | comment()"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:apply-templates select="/child::* | comment()" mode="start"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="comment()" mode="start">
		<xsl:comment>
			<xsl:value-of select="."/>
		</xsl:comment>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<!-- Output one plural container per input. -->
	<xsl:template match="*" mode="start">
		<xsl:call-template name="linebreak"/>
		<xsl:element name="{$objectOut}s" namespace="{$newNameSpace}">
			<xsl:attribute name="xsi:schemaLocation"><xsl:value-of select="$schemaLocation"/></xsl:attribute>
			<xsl:attribute name="version"><xsl:value-of select="$version"/></xsl:attribute>
			<xsl:call-template name="banner"/>
			<xsl:choose>
				<xsl:when test="$direction = 'forward'">
					<xsl:for-each select="./* | comment()">
						<xsl:choose>
							<xsl:when test="local-name(.)='documentInfo'">
								<xsl:if test="$dropDocumentInfo!='YES'">
									<xsl:apply-templates select="." mode="copy-Forward"/>
								</xsl:if>
							</xsl:when>
							<xsl:when test="local-name(.)=''">
								<!-- This is a comment. Copy it in the correct location. -->
								<xsl:apply-templates select="." mode="copy-Forward"/>
							</xsl:when>
							<xsl:when test="local-name(.)=$object and $object='wellLog'">
								<xsl:apply-templates select="." mode="wellLog-Forward"/>
							</xsl:when>
							<xsl:when test="local-name(.)=$object and $object='trajectoryStation' ">
								<xsl:apply-templates select="." mode="trajectoryStation-Forward"/>
							</xsl:when>
							<xsl:when test="local-name(.)=$object">
								<xsl:apply-templates select="." mode="copy-Forward"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
								<xsl:comment> A conversion for root child='<xsl:value-of select="local-name(.)"/>' is not supported. </xsl:comment>
								<xsl:comment> No conversion was applied. That is, the input was copied to the output. </xsl:comment>
								<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
								<xsl:copy-of select=". | comment()"/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:when>
				<xsl:when test="$direction = 'backward'">
					<xsl:for-each select="./* | comment()">
						<xsl:choose>
							<xsl:when test="local-name(.)='documentInfo'">
								<xsl:if test="$dropDocumentInfo!='YES'">
									<xsl:apply-templates select="." mode="copy-Backward"/>
								</xsl:if>
							</xsl:when>
							<xsl:when test="local-name(.)=''">
								<!-- This is a comment. Copy it in the correct location. -->
								<xsl:apply-templates select="." mode="copy-Backward"/>
							</xsl:when>
							<xsl:when test="local-name(.)=$object">
								<xsl:apply-templates select="." mode="copy-Backward"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
								<xsl:comment> A conversion for root child='<xsl:value-of select="local-name(.)"/>' is not supported. </xsl:comment>
								<xsl:comment> No conversion was applied. That is, the input was copied to the output. </xsl:comment>
								<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
								<xsl:copy-of select=". | comment()"/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:when>
				<xsl:otherwise>
					<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
					<xsl:comment> LOGIC-ERROR for direction. </xsl:comment>
					<xsl:comment> No conversion performed. </xsl:comment>
					<xsl:comment> /////////////////////////////////////////////////////////////////////// </xsl:comment>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:element>
	</xsl:template>
	<xsl:template name="banner">
		<xsl:if test="$omit-banner!='YES'">
			<xsl:comment> ======================================================================= </xsl:comment>
			<xsl:variable name="commentString">
				<xsl:text> Object=</xsl:text>
				<xsl:value-of select="$object"/>
				<xsl:choose>
					<xsl:when test="$direction='forward' and starts-with($object,'dts')">
						<xsl:text> conversion from WITSML v1.3.1.1 to PRODML v1.2 requested</xsl:text>
					</xsl:when>
					<xsl:when test="$direction='backward' and starts-with($object,'dts')">
						<xsl:text> conversion from PRODML v1.2 to WITSML v1.3.1.1 requested</xsl:text>
					</xsl:when>
					<xsl:when test="$direction='forward'">
						<xsl:text> conversion from WITSML v1.3.1.1 to v1.4.1 requested</xsl:text>
					</xsl:when>
					<xsl:when test="$direction='backward'">
						<xsl:text> conversion from WITSML v1.4.1 to v1.3.1.1 requested</xsl:text>
					</xsl:when>
				</xsl:choose>
				<xsl:if test="$request-date!=''">
					<xsl:text> on </xsl:text>
					<xsl:value-of select="$request-date"/>
				</xsl:if>
				<xsl:text>. </xsl:text>
			</xsl:variable>
			<xsl:comment>
				<xsl:value-of select="$commentString"/>
			</xsl:comment>
			<xsl:if test="$mode!=''">
				<xsl:comment>    mode='<xsl:value-of select="$mode"/>'. </xsl:comment>
			</xsl:if>
			<xsl:if test="$v131TimeZone!=''">
				<xsl:comment>    v131TimeZone='<xsl:value-of select="$v131TimeZone"/>'. </xsl:comment>
			</xsl:if>
			<xsl:if test="$dropDocumentInfo!=''">
				<xsl:comment>    dropDocumentInfo='<xsl:value-of select="$dropDocumentInfo"/>'. </xsl:comment>
			</xsl:if>
			<xsl:if test="$omitComment!=''">
				<xsl:comment>    omitComment='<xsl:value-of select="$omitComment"/>'. </xsl:comment>
			</xsl:if>
			<xsl:comment> ======================================================================= </xsl:comment>
		</xsl:if>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--                        Templates for FORWARD OBJECT conversion.                          -->
	<!--                       These templates are direction specific.                            -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template match="comment()" mode="copy-Forward">
		<xsl:comment>
			<xsl:value-of select="."/>
		</xsl:comment>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-Forward">
		<!-- Copies the text and attribute content of an element and all sub-elements into a new namespace. -->
		<!-- This copies the whole hierarchy into a new namespace. -->
		<xsl:variable name="elementName">
			<xsl:value-of select="local-name(.)"/>
		</xsl:variable>
		<xsl:variable name="parentName">
			<xsl:value-of select="local-name(./parent::*)"/>
		</xsl:variable>
		<xsl:variable name="renameLower">
			<!-- Do we need to rename the element from UpperCamelCase to lowerCamelCase?  -->
			<xsl:choose>
				<xsl:when test="./ancestor::*[local-name()='documentInfo'] and 
					$elementName!='documentClass' and
					$elementName!='System'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="newName">
			<!-- Do we need to rename the element?  -->
			<xsl:choose>
				<xsl:when test="$renameLower='YES'">
					<!-- Convert the first character to lower case.  -->
					<xsl:value-of select="concat(
							 translate(substring($elementName,1,1)
								  ,'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
								  ,'abcdefghijklmnopqrstuvwxyz')
							,substring($elementName,2))"/>
				</xsl:when>
				<xsl:when test="$elementName='System'">securitySystem</xsl:when>
				<xsl:when test="$elementName='mdCurrent'  and $parentName='wellbore'">md</xsl:when>
				<xsl:when test="$elementName='tvdCurrent' and $parentName='wellbore'">tvd</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$elementName"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="newValue">
			<!-- Do we need to change the value? A non-null value that is different from the input value will indicate that we do. -->
			<xsl:choose>
				<xsl:when test="$elementName='matrixCement'">
					<xsl:apply-templates select="." mode="copy-matrixCement-Forward"/>
				</xsl:when>
				<xsl:when test="$elementName='classWitsml'">
					<xsl:apply-templates select="." mode="copy-RealtimeData-Forward"/>
				</xsl:when>
				<xsl:when test="$elementName='statusTrajStation'">
					<xsl:apply-templates select="." mode="copy-statusTrajStation-Forward"/>
				</xsl:when>
				
				<xsl:otherwise/>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="modifyDateTime">
			<xsl:choose>
				<xsl:when test="$v131TimeZone!=''">
					<xsl:choose>
						<xsl:when test="starts-with($elementName,'dTim')">YES</xsl:when>
						<xsl:when test="$elementName='DocumentDate'">YES</xsl:when>
						<xsl:when test="$elementName='FileCreationDate'">YES</xsl:when>
						<xsl:when test="$elementName='EndDate'">YES</xsl:when>
						<xsl:when test="$elementName='EventDate'">YES</xsl:when>
						<xsl:when test="$elementName='startDateTimeIndex'">YES</xsl:when>
						<xsl:when test="$elementName='endDateTimeIndex'">YES</xsl:when>
						<xsl:when test="$elementName='maxDateTimeIndex'">YES</xsl:when>
						<xsl:when test="$elementName='minDateTimeIndex'">YES</xsl:when>
						<xsl:when test="$elementName='chromIntRpt'">YES</xsl:when>
						<xsl:when test="$elementName='creationDate'">YES</xsl:when>
						<xsl:when test="$elementName='installationDate'">YES</xsl:when>
						<xsl:when test="$elementName='lastAbandonDrill'">YES</xsl:when>
						<xsl:when test="$elementName='lastBopDrill'">YES</xsl:when>
						<xsl:when test="$elementName='lastBopPresTest'">YES</xsl:when>
						<xsl:when test="$elementName='lastCsgPresTest'">YES</xsl:when>
						<xsl:when test="$elementName='lastDiverterDrill'">YES</xsl:when>
						<xsl:when test="$elementName='lastFireBoatDrill'">YES</xsl:when>
						<xsl:when test="$elementName='lastRigInspection'">YES</xsl:when>
						<xsl:when test="$elementName='lastSafetyInspection'">YES</xsl:when>
						<xsl:when test="$elementName='lastSafetyMeeting'">YES</xsl:when>
						<xsl:when test="$elementName='lastTripDrill'">YES</xsl:when>
						<xsl:when test="$elementName='nextBopPresTest'">YES</xsl:when>
						<xsl:otherwise>NO</xsl:otherwise>
					</xsl:choose>
				</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="keep">
			<!-- Do we want to keep this element. That is, does it exist in the newer version. -->
			<xsl:choose>
				<xsl:when test="$elementName='dataRowCount'"/>
				<xsl:when test="$elementName='columnIndex'    and $parentName!='channelDefinition'"/>
				<xsl:when test="$elementName='tqYield'"/>
				<!-- The measure type changed. -->
				<xsl:when test="$elementName='modelToolError' and $parentName='trajectoryStation'"/>
				<xsl:when test="$elementName='customData'     and $parentName='trajectoryStation'"/>
				<xsl:otherwise>YES</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropElement">
			<!-- Arbitrarily drop the element.  -->
			<!-- Do not issue a message because the element was moved to the trajectory wrapper. -->
			<xsl:choose>
				<xsl:when test="$elementName='nameWell'       and $parentName='trajectoryStation'">YES</xsl:when>
				<xsl:when test="$elementName='nameWellbore'   and $parentName='trajectoryStation'">YES</xsl:when>
				<xsl:when test="$elementName='nameTrajectory' and $parentName='trajectoryStation'">YES</xsl:when>
			<!-- Do not issue a message because the element was deprecated or removed. 1.4.1.1 specific. -->
				<xsl:when test="$elementName='nameFormation'  and $parentName='formationMarker'">YES</xsl:when>
				<xsl:when test="$elementName='requestLatestValue' and $parentName='log'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropUid">
			<!-- Arbitrarily drop the uid attribute.  -->
			<xsl:choose>
				<xsl:when test="$elementName='instrumentBoxInformation' and $parentName='dtsInstalledSystem'">YES</xsl:when>
				<xsl:when test="$elementName='instrumentBox'            and $parentName='instrumentBoxInformation'">YES</xsl:when>
				<xsl:when test="$elementName='pumpActivity'             and $parentName='dtsInstalledSystem'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropDatum">
			<!-- Does this element contain a datum attribute that should be dropped. -->
			<xsl:choose>
				<xsl:when test="$elementName='mdDelta'">YES</xsl:when>
				<xsl:when test="$elementName='tvdDelta'">YES</xsl:when>
				<xsl:when test="$elementName='mdWater'">YES</xsl:when>
				<xsl:when test="$elementName='waterDepth'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropColumnIndex">
			<!-- Does this element contain a columnIndex attribute that should be dropped. -->
			<xsl:choose>
				<xsl:when test="$elementName='indexCurve' and $parentName='log'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="addIndexedOjectUid">
			<!-- Does this element need a uid? -->
			<xsl:choose>
				<xsl:when test="$elementName='param'         and $parentName='attachment'">YES</xsl:when>
				<xsl:when test="$elementName='param'         and $parentName='message'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='log'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='wellLog'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='blockInfo'">YES</xsl:when>
				<xsl:when test="$elementName='parameter'     and $parentName='projectionx'">YES</xsl:when>
				<xsl:when test="$elementName='anchorTension' and $parentName='rigResponse'">YES</xsl:when>
				<xsl:when test="$elementName='anchorAngle'   and $parentName='rigResponse'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test="$modifyDateTime='YES'">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:variable name="TIME">
				<xsl:value-of select="substring-after(.,'T')"/>
			</xsl:variable>
			<xsl:if test="contains(.,'T') and not(contains($TIME,'Z') or contains($TIME,'+') or contains($TIME,'-'))">
				<xsl:call-template name="add-comment">
					<xsl:with-param name="string">ADDED: timezone='<xsl:value-of select="$v131TimeZone"/>' to-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
		</xsl:if>
		<xsl:if test="$elementName='SecurityInformation' or $elementName='Event'">
			<!-- Add a comment if we will not do something within the element creation. -->
			<xsl:choose>
				<xsl:when test="$mode='write'">
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">ADDED: @uid to-element='<xsl:value-of select="$newName"/>'.</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:when test="$mode='update' or $mode='delete'">
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">WARNING: element='<xsl:value-of select="$newName"/>' now has a uid attribute.'</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<!-- Else read. Do nothing. -->
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="./@datum and $dropDatum='YES'">
			<!-- Add a comment if we will not do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @datum='<xsl:value-of select="./@datum"/>' from-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="./@columnIndex and $dropColumnIndex='YES'">
			<!-- Add a comment if we will not do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @columnIndex='<xsl:value-of select="./@columnIndex"/>' from-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$addIndexedOjectUid='YES'">
			<xsl:choose>
				<xsl:when test="$mode='write'">
					<!-- Add a comment if we will do something within the element creation. -->
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">ADDED: @uid to-element='<xsl:value-of select="$newName"/>' with @index='<xsl:value-of select="@index"/>'</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:when test="$mode='update' or $mode='delete'">
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">WARNING: element='<xsl:value-of select="$newName"/>' now has a uid attribute.'</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<!-- Else read. Do nothing. -->
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$dropUid='YES' and @uid">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @uid='<xsl:value-of select="./@uid"/>' from-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$elementName='bitRecord'">
			<xsl:choose>
				<xsl:when test="$mode='write'">
					<!-- Add a comment if we will do something within the element creation. -->
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">ADDED: @uid to-element='<xsl:value-of select="$newName"/>' with numBit='<xsl:value-of select="w131:numBit"/>' and diaBit='<xsl:value-of select="w131:diaBit"/>'</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:when test="$mode='update' or $mode='delete'">
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">WARNING: element='<xsl:value-of select="$newName"/>' now has a uid attribute.'</xsl:with-param>
					</xsl:call-template>
				</xsl:when>
				<xsl:otherwise>
					<!-- Else read. Do nothing. -->
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
		<xsl:if test="$elementName!=$newName and $renameLower!='YES'">
			<!-- Add a comment if we will do something within the element creation. -->
			<!-- Do not add a comment if we are renaming UpperCamelCase to lowerCamelCase. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">RENAMED: '<xsl:value-of select="$elementName"/>' to '<xsl:value-of select="$newName"/>'.'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$newValue!='' and  $newValue!=.">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">CHANGED: '<xsl:value-of select="$newName"/>' value-from '<xsl:value-of select="."/>'.'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$elementName='documentInfo'">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">RENAMED: Most descendent elements of documentInfo were renamed from UpperCamelCase to lowerCamelCase.</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:choose>
			<xsl:when test="$dropElement='YES'">
				<!-- Drop the element without comment. -->
			</xsl:when>
			<xsl:when test="$keep!='YES'">
				<!-- Add a comment that we will not create the element. -->
				<xsl:apply-templates select="." mode="encode-add-comment">
					<xsl:with-param name="string">DELETED:</xsl:with-param>
				</xsl:apply-templates>
			</xsl:when>
			<xsl:otherwise>
				<xsl:element name="{$newName}" namespace="{$newNameSpace}">
					<xsl:choose>
						<xsl:when test="$newValue!='' and $newValue!=.">
							<!-- A new value will be used. -->
							<xsl:value-of select="$newValue"/>
						</xsl:when>
						<xsl:when test="$modifyDateTime='YES'">
							<!-- This is a timestamp and we need to check for a timezone. -->
							<xsl:apply-templates select="." mode="timestamp-Forward"/>
						</xsl:when>
						<xsl:when test="$elementName='customData'">
							<!-- Copy all children in the specified namespace. -->
							<xsl:copy-of select="* | text() | @* | comment()"/>
						</xsl:when>
						<xsl:when test="$elementName='SecurityInformation'">
							<!-- Add a uid. -->
							<xsl:apply-templates select="." mode="cs_documentSecurityInfo-FWD"/>
						</xsl:when>
						<xsl:when test="$elementName='Event'">
							<!-- Add a uid. -->
							<xsl:apply-templates select="." mode="cs_documentEvent-FWD"/>
						</xsl:when>
						<xsl:when test="$addIndexedOjectUid='YES' and $mode='write'">
							<!-- We will need to create a uid attribute. -->
							<xsl:apply-templates select="." mode="indexedObject-Forward"/>
						</xsl:when>
						<xsl:when test="$elementName='bitRecord'">
							<!-- We will need to create a uid attribute. -->
							<xsl:apply-templates select="." mode="bitRecord-Forward"/>
						</xsl:when>
						<xsl:when test="$elementName='logData' and $parentName='log'">
							<!-- We will need to create mnemonicList and unitList. -->
							<xsl:call-template name="copy-comment"/>
							<xsl:apply-templates select="." mode="logData-log-Forward"/>
						</xsl:when>
						<xsl:when test="$elementName='wellDatum' and $parentName='well'">
							<!-- We will need to delete default attributes. -->
							<xsl:apply-templates select="." mode="wellDatum-Forward"/>
						</xsl:when>
						<xsl:when test="$dropDatum='YES'">
							<!-- Do not copy the datum attribute. -->
							<xsl:apply-templates select="." mode="copy-value-uom"/>
						</xsl:when>
						<xsl:when test="$dropColumnIndex='YES'">
							<!-- Do not copy the columnIndex attribute. -->
							<xsl:value-of select="."/>
						</xsl:when>
						<xsl:otherwise>
							<!-- Copy children in new namespace. -->
							<xsl:for-each select="./@*">
								<xsl:if test="name(.)!='uid' or (name(.)='uid' and $dropUid!='YES')">
									<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
								</xsl:if>
							</xsl:for-each>
							<xsl:if test="$elementName='lithology' and 
							      ($parentName='swcSample' or $parentName='geologyInterval') and 
							      not(./child::*[local-name(.)='type']) and
							      $mode='write'">
								<!-- type is now mandatory. -->
								<xsl:call-template name="add-comment">
									<xsl:with-param name="string">ADDED: type='unknown'.</xsl:with-param>
								</xsl:call-template>
								<xsl:element name="type" namespace="{$newNameSpace}">unknown</xsl:element>
								<xsl:call-template name="linebreak"/>
							</xsl:if>
							<xsl:if test="./child::*">
								<xsl:call-template name="linebreak"/>
							</xsl:if>
							<!-- Copy the content of this element either as text or as more element content. -->
							<xsl:apply-templates mode="copy-Forward"/>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>
				<xsl:call-template name="linebreak"/>
				<xsl:if test="$elementName='mdTop' and 
				      not(./following-sibling::*[local-name(.)='mdBottom']) and
				      $mode='write'">
					<!-- mdBottom is now mandatory. Set mdBottom=mdTop. -->
					<xsl:call-template name="add-comment">
						<xsl:with-param name="string">ADDED: mdBottom equal to value of mdTop.</xsl:with-param>
					</xsl:call-template>
					<xsl:element name="mdBottom" namespace="{$newNameSpace}">
						<xsl:for-each select="./@*">
							<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
						</xsl:for-each>
						<xsl:value-of select="."/>
					</xsl:element>
					<xsl:call-template name="linebreak"/>
				</xsl:if>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="text()" mode="copy-Forward">
		<!-- Copies the text content of an element. -->
		<xsl:value-of select="."/>
	</xsl:template>
	<xsl:template match="*" mode="indexedObject-Forward">
		<!-- Copy the attributes and create @uid. -->
		<xsl:if test="./@index">
			<xsl:attribute name="index"><xsl:value-of select="./@index"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@name">
			<xsl:attribute name="name"><xsl:value-of select="./@name"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@uom">
			<xsl:attribute name="uom"><xsl:value-of select="./@uom"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@description">
			<xsl:attribute name="description"><xsl:value-of select="./@description"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="$mode='write'">
			<xsl:attribute name="uid"><xsl:value-of select="translate(@index,' ','_')"/><xsl:if test="@index!='' and @name!=''"><xsl:text>_</xsl:text></xsl:if><xsl:value-of select="translate(@name,' ','_')"/></xsl:attribute>
		</xsl:if>
		<xsl:value-of select="."/>
	</xsl:template>
	<xsl:template match="*" mode="bitRecord-Forward">
		<!-- Add a uid and then copy everything else. -->
		<xsl:if test="$mode='write'">
			<xsl:attribute name="uid"><xsl:value-of select="translate(w131:numbit,' ','_')"/><xsl:if test="w131:numbit!='' and w131:diaBit!=''"><xsl:text>_</xsl:text></xsl:if><xsl:value-of select="translate(w131:diaBit,' ','_')"/></xsl:attribute>
		</xsl:if>
		<xsl:apply-templates mode="copy-Forward"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-value-uom">
		<!-- Copy the element value and uom attribute. Any datum is not copied. -->
		<xsl:if test="./@uom">
			<xsl:attribute name="uom"><xsl:value-of select="./@uom"/></xsl:attribute>
		</xsl:if>
		<xsl:value-of select="."/>
	</xsl:template>
	<xsl:template match="*" mode="timestamp-Forward">
		<!-- Copy the timestamp and possibly add a timezone. -->
		<xsl:variable name="TIME">
			<xsl:value-of select="substring-after(.,'T')"/>
		</xsl:variable>
		<xsl:choose>
			<xsl:when test="not(contains(.,'T')) or (contains($TIME,'Z') or contains($TIME,'+') or contains($TIME,'-'))">
				<!-- Either a time was not given or a timezone already exists. -->
				<xsl:value-of select="."/>
			</xsl:when>
			<xsl:otherwise>
				<!-- Add a timezone. -->
				<xsl:value-of select="."/>
				<xsl:value-of select="$v131TimeZone"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="copy-matrixCement-Forward">
		<!-- The matrixCement values are controlled in v141. -->
		<xsl:variable name="lowerValue">
			<xsl:value-of select="translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')"/>
		</xsl:variable>
		<xsl:choose>
			<!-- Null value is probably a template. -->
			<xsl:when test=".=''"/>
			<xsl:when test="$lowerValue='ankerite'  or $lowerValue='calcite' or $lowerValue='chlorite' or $lowerValue='dolomite' or $lowerValue='illite' or 
				$lowerValue='kaolinite' or $lowerValue='quartz'  or $lowerValue='siderite' or $lowerValue='smectite' or $lowerValue='unknown'">
				<xsl:value-of select="$lowerValue"/>
			</xsl:when>
			<xsl:otherwise>unknown</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="copy-RealtimeData-Forward">
		<!-- Copy the element value (possibly renamed). -->
		<xsl:choose>
			<xsl:when test=".='TVD of Bit'">TVD of bit</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="."/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="wellDatum-Forward">
		<xsl:variable name="uidValue">
			<xsl:choose>
				<xsl:when test="@uid">
					<xsl:value-of select="./@uid"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select=" translate(child::*[local-name(.)='name'],' ','_')"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test="$mode='write' or @uid">
			<xsl:attribute name="uid"><xsl:value-of select="$uidValue"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="$mode='write'">
			<!-- The uid attribute is now mandatory. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">ADDED: @uid to-element='wellDatum'.</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:call-template name="linebreak"/>
		<xsl:call-template name="copy-comment"/>
		<xsl:if test="@defaultMeasuredDepth">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @defaultMeasuredDepth='<xsl:value-of select="./@defaultMeasuredDepth"/>' from-element=wellDatum</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="@defaultVerticalDepth">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @defaultVerticalDepth='<xsl:value-of select="./@defaultVerticalDepth"/>' from-element=wellDatum</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="@defaultElevation">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @defaultElevation='<xsl:value-of select="./@defaultElevation"/>' from-element=wellDatum</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:apply-templates select="./child::*" mode="copy-Forward"/>
	</xsl:template>
	<xsl:template match="*" mode="logData-log-Forward">
		<!-- Context is logData within log. -->
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">ADDED: mnemonicList</xsl:with-param>
		</xsl:call-template>
		<xsl:element name="mnemonicList" namespace="{$newNameSpace}">
			<xsl:for-each select="../w131:logCurveInfo">
				<xsl:sort select="w131:columnIndex" data-type="number"/>
				<xsl:choose>
					<xsl:when test="position()=1">
						<xsl:value-of select="./w131:mnemonic"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="./w131:mnemonic"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</xsl:element>
		<!-- Create unitList. -->
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">ADDED: unitList</xsl:with-param>
		</xsl:call-template>
		<xsl:element name="unitList" namespace="{$newNameSpace}">
			<xsl:for-each select="../w131:logCurveInfo">
				<xsl:sort select="w131:columnIndex" data-type="number"/>
				<xsl:variable name="unit">
					<xsl:value-of select="./w131:unit"/>
				</xsl:variable>
				<xsl:choose>
					<xsl:when test="position()=1">
						<xsl:if test="$unit!=''">
							<xsl:value-of select="$unit"/>
						</xsl:if>
					</xsl:when>
					<xsl:when test="$unit=''">
						<xsl:text>,</xsl:text>
					</xsl:when>
					<xsl:otherwise>
						<xsl:text>,</xsl:text>
						<xsl:value-of select="$unit"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</xsl:element>
		<xsl:apply-templates select="w131:data" mode="copy-Forward"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-timestamp-Forward">
		<!-- Create an element with the same text content but with a different name and namespace. -->
		<!-- Any attributes will be ignored (i.e., not copied). -->
		<!-- This should NOT be called for container elements. -->
		<xsl:element name="{name(.)}" namespace="{$newNameSpace}">
			<xsl:apply-templates select="." mode="timestamp-Forward"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--              Special template for FORWARD conversion of wellLog.                         -->
	<!--                       This template is direction specific.                               -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template match="w131:wellLog" mode="wellLog-Forward">
		<!-- Convert each wellLog to multiple log. -->
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">CONVERTED: Each wellLog[@uid='<xsl:value-of select="@uid"/>']/blockInfo into one log. The log uid will be a concatenation of the wellLog uid and the blockInfo uid.</xsl:with-param>
		</xsl:call-template>
		<xsl:for-each select=".//w131:blockInfo">
			<xsl:variable name="uidValue">
				<xsl:choose>
					<xsl:when test="../@uid!='' and @uid!=''">
						<xsl:value-of select="concat(../@uid,'::',@uid)"/>
					</xsl:when>
					<xsl:otherwise/>
				</xsl:choose>
			</xsl:variable>
			<xsl:element name="log" namespace="{$newNameSpace}">
				<xsl:if test="../@uidWell">
					<xsl:attribute name="uidWell"><xsl:value-of select="../@uidWell"/></xsl:attribute>
				</xsl:if>
				<xsl:if test="../@uidWellbore">
					<xsl:attribute name="uidWellbore"><xsl:value-of select="../@uidWellbore"/></xsl:attribute>
				</xsl:if>
				<xsl:if test="@uid">
					<xsl:attribute name="uid"><xsl:value-of select="$uidValue"/></xsl:attribute>
				</xsl:if>
				<xsl:apply-templates select="../w131:nameWell" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:nameWellbore" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:name" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:objectGrowing" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:serviceCompany" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:runNumber" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:bhaRunNumber" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:pass" mode="copy-Forward"/>
				<xsl:apply-templates select="../w131:creationDate" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:description" mode="wellLog-Forward"/>
				<xsl:apply-templates select="w131:indexType" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:startIndex" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:endIndex" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:stepIncrement" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:startDateTimeIndex" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:endDateTimeIndex" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:direction" mode="copy-Forward"/>
				<xsl:apply-templates select="w131:indexCurve" mode="wellLog-Forward"/>
				<xsl:apply-templates select="w131:nullValue" mode="wellLog-Forward"/>
				<xsl:apply-templates select="." mode="logParam-wellLog-Forward"/>
				<xsl:for-each select="w131:blockCurveInfo">
					<xsl:apply-templates select="." mode="wellLog-Forward"/>
				</xsl:for-each>
				<xsl:apply-templates select="." mode="logData-wellLog-Forward"/>
				<xsl:apply-templates select="../w131:commonData" mode="copy-Forward"/>
			</xsl:element>
		</xsl:for-each>
	</xsl:template>
	<xsl:template match="w131:blockInfo/w131:description" mode="wellLog-Forward">
		<xsl:variable name="descValue">
			<xsl:choose>
				<xsl:when test="../../w131:description!='' and .!=''">
					<xsl:value-of select="concat(../../w131:description,'::',.)"/>
				</xsl:when>
				<xsl:when test="../../w131:description!=''">
					<xsl:value-of select="../../w131:description"/>
				</xsl:when>
				<xsl:when test=".!=''">
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:otherwise/>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test="../../w131:description!='' and .!=''">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">CHANGED: Concatenated blockInfo description to wellLog description.</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="../../w131:description or .">
			<xsl:element name="description" namespace="{$newNameSpace}">
				<xsl:value-of select="$descValue"/>
			</xsl:element>
			<xsl:call-template name="linebreak"/>
		</xsl:if>
	</xsl:template>
	<xsl:template match="w131:blockInfo/w131:indexCurve" mode="wellLog-Forward">
		<!-- The context is w131:blockInfo/w131:indexCurve. -->
		<xsl:if test="@columnIndex">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: attribute columnIndex=<xsl:value-of select="@columnIndex"/>.</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:element name="indexCurve" namespace="{$newNameSpace}">
			<xsl:value-of select="."/>
		</xsl:element>
	</xsl:template>
	<xsl:template match="w131:blockInfo/w131:nullValue" mode="wellLog-Forward">
		<!-- Use either the block value or the parent value. -->
		<xsl:variable name="nullValue">
			<xsl:choose>
				<xsl:when test=".">
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="../../w131:nullValue"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test=". or ../../w131:nullValue">
			<xsl:element name="nullValue" namespace="{$newNameSpace}">
				<xsl:value-of select="$nullValue"/>
			</xsl:element>
		</xsl:if>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="logParam-wellLog-Forward">
		<!-- The context is w131:blockInfo. -->
		<!--Copy the values from the parent as well as the block. -->
		<xsl:for-each select="../w131:logParam">
			<xsl:apply-templates select="." mode="copy-Forward"/>
		</xsl:for-each>
		<xsl:for-each select="w131:logParam">
			<xsl:apply-templates select="." mode="copy-Forward"/>
		</xsl:for-each>
	</xsl:template>
	<xsl:template match="w131:blockCurveInfo" mode="wellLog-Forward">
		<!-- The context is w131:blockInfo/w131:blockCurveInfo. -->
		<xsl:variable name="curveId">
			<xsl:value-of select="./w131:curveId"/>
		</xsl:variable>
		<xsl:variable name="curveInfoNodeSet" select="../../w131:logCurveInfo[@uid=$curveId]"/>
		<xsl:element name="logCurveInfo" namespace="{$newNameSpace}">
			<xsl:if test="./w131:curveId">
				<xsl:attribute name="uid"><xsl:value-of select="$curveId"/></xsl:attribute>
			</xsl:if>
			<xsl:call-template name="copy-comment"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:mnemonic" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:classWitsml" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:unit" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:mnemAlias" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:nullValue" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:alternateIndex" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:wellDatum" mode="copy-Forward"/>
			<xsl:apply-templates select="w131:minIndex" mode="copy-Forward"/>
			<xsl:apply-templates select="w131:maxIndex" mode="copy-Forward"/>
			<xsl:apply-templates select="w131:minDateTimeIndex" mode="copy-Forward"/>
			<xsl:apply-templates select="w131:maxDateTimeIndex" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:curveDescription" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:sensorOffset" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:dataSource" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:densData" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:traceState" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:traceOrigin" mode="copy-Forward"/>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:typeLogData" mode="copy-Forward"/>
			<xsl:if test="$curveInfoNodeSet/w131:encodingDef">
				<xsl:call-template name="add-comment">
					<xsl:with-param name="string">DELETED: encodingDef=<xsl:value-of select="$curveInfoNodeSet/w131:encodingDef"/>
					</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:apply-templates select="$curveInfoNodeSet/w131:axisDefinition" mode="copy-Forward"/>
		</xsl:element>
	</xsl:template>
	<xsl:template match="*" mode="logData-wellLog-Forward">
		<!-- Context is blockInfo within wellLog. -->
		<xsl:variable name="blockId">
			<xsl:value-of select="@uid"/>
		</xsl:variable>
		<xsl:if test="../w131:logData">
			<xsl:element name="logData" namespace="{$newNameSpace}">
				<xsl:call-template name="add-comment">
					<xsl:with-param name="string">ADDED: mnemonicList.'</xsl:with-param>
				</xsl:call-template>
				<xsl:element name="mnemonicList" namespace="{$newNameSpace}">
					<xsl:for-each select="./w131:blockCurveInfo">
						<xsl:sort select="w131:columnIndex" data-type="number"/>
						<xsl:variable name="curveId">
							<xsl:value-of select="w131:curveId"/>
						</xsl:variable>
						<xsl:choose>
							<xsl:when test="position()=1">
								<xsl:value-of select="../../w131:logCurveInfo[@uid=$curveId]/w131:mnemonic"/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:text>,</xsl:text>
								<xsl:value-of select="../../w131:logCurveInfo[@uid=$curveId]/w131:mnemonic"/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:element>
				<!-- Create unitList. -->
				<xsl:call-template name="add-comment">
					<xsl:with-param name="string">ADDED: unitList.'</xsl:with-param>
				</xsl:call-template>
				<xsl:element name="unitList" namespace="{$newNameSpace}">
					<xsl:for-each select="./w131:blockCurveInfo">
						<xsl:sort select="w131:columnIndex" data-type="number"/>
						<xsl:variable name="curveId">
							<xsl:value-of select="w131:curveId"/>
						</xsl:variable>
						<xsl:variable name="unit">
							<xsl:value-of select="../../w131:logCurveInfo[@uid=$curveId]/w131:unit"/>
						</xsl:variable>
						<xsl:choose>
							<xsl:when test="position()=1">
								<xsl:if test="$unit!=''">
									<xsl:value-of select="$unit"/>
								</xsl:if>
							</xsl:when>
							<xsl:when test="$unit=''">
								<xsl:text>,</xsl:text>
							</xsl:when>
							<xsl:otherwise>
								<xsl:text>,</xsl:text>
								<xsl:value-of select="$unit"/>
							</xsl:otherwise>
						</xsl:choose>
					</xsl:for-each>
				</xsl:element>
				<xsl:choose>
					<xsl:when test="not(../w131:logData/w131:data/@id)">
						<!-- No id attribute which means that there should only be one block. -->
						<xsl:apply-templates select="../w131:logData/w131:data" mode="copy-element"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:apply-templates select="../w131:logData/w131:data[@id=$blockId]" mode="copy-element"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:element>
		</xsl:if>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--              Special template for FORWARD conversion of trajectoryStation.               -->
	<!--                       This template is direction specific.                               -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template match="w131:trajectoryStation" mode="trajectoryStation-Forward">
		<xsl:call-template name="linebreak"/>
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">CONVERTED: trajectoryStation to trajectory/trajectoryStation.</xsl:with-param>
		</xsl:call-template>
		<xsl:element name="trajectory" namespace="{$newNameSpace}">
			<xsl:if test="@uidWell">
				<xsl:attribute name="uidWell"><xsl:value-of select="@uidWell"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="@uidWellbore">
				<xsl:attribute name="uidWellbore"><xsl:value-of select="@uidWellbore"/></xsl:attribute>
			</xsl:if>
			<xsl:if test="@uidTrajectory">
				<xsl:attribute name="uid"><xsl:value-of select="@uidTrajectory"/></xsl:attribute>
				<xsl:call-template name="add-comment">
					<xsl:with-param name="string">CONVERTED: @uidTrajectory to @uid</xsl:with-param>
				</xsl:call-template>
			</xsl:if>
			<xsl:apply-templates select="w131:nameWell" mode="copy-element"/>
			<xsl:apply-templates select="w131:nameWellbore" mode="copy-element"/>
			<xsl:apply-templates select="w131:nameTrajectory" mode="rename-element">
				<xsl:with-param name="newName">name</xsl:with-param>
			</xsl:apply-templates>
			<xsl:element name="trajectoryStation" namespace="{$newNameSpace}">
				<xsl:if test="@uid">
					<xsl:attribute name="uid"><xsl:value-of select="@uid"/></xsl:attribute>
				</xsl:if>
				<xsl:apply-templates select="./child::* | comment()" mode="copy-Forward"/>
			</xsl:element>
		</xsl:element>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--                       Templates for BACKWARD OBJECT conversion.                          -->
	<!--                       These templates are direction specific.                            -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template match="comment()" mode="copy-Backward">
		<xsl:comment>
			<xsl:value-of select="."/>
		</xsl:comment>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-Backward">
		<!-- Copies the text and attribute content of an element and all sub-elements into a new namespace. -->
		<!-- This copies the whole hierarchy into a new namespace. -->
		<xsl:variable name="elementName">
			<xsl:value-of select="local-name(.)"/>
		</xsl:variable>
		<xsl:variable name="parentName">
			<xsl:value-of select="local-name(./parent::*)"/>
		</xsl:variable>
		<xsl:variable name="renameUpper">
			<!-- Do we need to rename the element from lowerCamelCase to UpperCamelCase?  -->
			<xsl:choose>
				<xsl:when test="./ancestor::*[local-name()='documentInfo'] and 
					$elementName!='documentClass' and
					$elementName!='securitySystem'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="newName">
			<!-- Do we need to rename the element?  -->
			<xsl:choose>
				<xsl:when test="$renameUpper='YES'">
					<!-- Convert the first character to upper case.  -->
					<xsl:value-of select="concat(
							 translate(substring($elementName,1,1)
								  ,'abcdefghijklmnopqrstuvwxyz'
								  ,'ABCDEFGHIJKLMNOPQRSTUVWXYZ')
							,substring($elementName,2))"/>
				</xsl:when>
				<xsl:when test="$elementName='securitySystem'">System</xsl:when>
				<xsl:when test="$elementName='md'  and $parentName='wellbore'">mdCurrent</xsl:when>
				<xsl:when test="$elementName='tvd' and $parentName='wellbore'">tvdCurrent</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$elementName"/>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="newValue">
			<!-- Do we need to change the value? A non-null value that is different from the input value will indicate that we do. -->
			<xsl:choose>
				<xsl:when test="$elementName='type'  and $parentName='lithology'">
					<xsl:apply-templates select="." mode="copy-LithologyType-Backward"/>
				</xsl:when>
				<xsl:when test="$elementName='type'  and $parentName='qualifier'">
					<xsl:apply-templates select="." mode="copy-QualifierType-Backward"/>
				</xsl:when>
				<xsl:when test="$elementName='classWitsml'">
					<xsl:apply-templates select="." mode="copy-RealtimeData-Backward"/>
				</xsl:when>
				<xsl:when test="$elementName='typeLogData'">
					<xsl:apply-templates select="." mode="typeLogData-Backward"/>
				</xsl:when>
				<xsl:otherwise/>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="keep">
			<!-- Do we want to keep this element. That is, does it exist in the older version. -->
			<xsl:choose>
				<xsl:when test="$elementName='extensionNameValue'"/>
				<xsl:when test="$elementName='dTimMin'      and $object='dtsMeasurement'"/>
				<xsl:when test="$elementName='dTimMax'      and $object='dtsMeasurement'"/>
				<xsl:when test="$elementName='dTimCurrent'  and $object='dtsMeasurement'"/>
				<xsl:when test="$elementName='dTim'         and $object='dtsMeasurement'"/>
				<xsl:when test="$elementName='processedLog' and $object='dtsMeasurement'"/>
				<xsl:when test="$elementName='dateMin'      and $object='dtsInstalledSystem'"/>
				<xsl:when test="$elementName='dateMax'      and $object='dtsInstalledSystem'"/>
				<xsl:when test="$elementName='dateCurrent'  and $object='dtsInstalledSystem'"/>
				<xsl:when test="$elementName='wellContext'  and ($object='dtsInstalledSystem' or $object='dtsMeasurement')"/>
				<xsl:when test="$elementName='queryParam'"/>
				<xsl:when test="$elementName='eventType'"/>
				<xsl:when test="$elementName='extensionAny'"/>
				<xsl:when test="$elementName='serviceCategory'"/>
				<xsl:when test="$elementName='acquisitionTimeZone'"/>
				<xsl:when test="$elementName='defaultDatum'"/>
				<xsl:when test="$elementName='privateGroupOnly'"/>
				<xsl:when test="$elementName='dataDelimiter'"/>
				<xsl:when test="$elementName='dataUpateRate'"/>
				<xsl:when test="$elementName='dataGroup'"/>
				<xsl:when test="$elementName='classIndex'"/>
				<xsl:when test="$elementName='curveSensorsAligned'"/>
				<xsl:when test="$elementName='codeMfg'"/>
				<xsl:when test="$elementName='mudClass'"/>
				<xsl:when test="$elementName='proprietaryCode'"/>
				<xsl:when test="$elementName='stateDetailActivity'"/>
				<xsl:when test="$elementName='depthRegistrationData'"/>
				<xsl:when test="$elementName='calcAlgorithm'"/>
				<xsl:when test="$elementName='infieldRefCorUsed'"/>
				<xsl:when test="$elementName='interpolatedInfieldRefCorUsed'"/>
				<xsl:when test="$elementName='inHoleRefCorUsed'"/>
				<xsl:when test="$elementName='axialMagInterferenceCorUsed'"/>
				<xsl:when test="$elementName='cosagCorUsed'"/>
				<xsl:when test="$elementName='MSACorUsed'"/>
				<xsl:when test="$elementName='stnGridConUsed'"/>
				<xsl:when test="$elementName='gridConUsed'"/>
				<xsl:when test="$elementName='magTran1MSACor'"/>
				<xsl:when test="$elementName='magTran2MSACor'"/>
				<xsl:when test="$elementName='magAxialMSACor'"/>
				<xsl:when test="$elementName='magneticDeclination'"/>
				<xsl:when test="$elementName='gridConvergence'"/>
				<xsl:when test="$elementName='mapProjectionCRS'"/>
				<xsl:when test="$elementName='geodeticCRS'"/>
				<xsl:when test="$elementName='datumCRS'"/>
				<xsl:when test="$elementName='horizontalLocation'"/>
				<xsl:when test="$elementName='wellPublicLandSurveySystemLocation'"/>
				<xsl:when test="$elementName='mdBit'               and $parentName='wellbore'"/>
				<xsl:when test="$elementName='tvdBit'              and $parentName='wellbore'"/>
				<xsl:when test="$elementName='isActive'            and $parentName='wellbore'"/>
				<xsl:when test="$elementName='tvd'                 and $parentName='fluid'"/>
				<xsl:when test="$elementName='presBopRating'       and $parentName='fluid'"/>
				<xsl:when test="$elementName='md'                  and $parentName='activity'"/>
				<xsl:when test="$elementName='tvd'                 and $parentName='activity'"/>
				<xsl:when test="$elementName='tqYield'"/>
				<xsl:when test="$elementName='mnemonicList'"/>
				<xsl:when test="$elementName='unitList'"/>
				<xsl:when test="$elementName='commonTime'"/>
				<xsl:when test="$elementName='iscwsaToolErrorModel'"/>
				<xsl:when test="$elementName='indexCurve'          and $parentName='wellLog'"/>
				<!-- Moved. -->
				<xsl:otherwise>YES</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropIndexedOjectUid">
			<!-- Do we need to drop the uid? -->
			<xsl:choose>
				<xsl:when test="not(@uid)">NO</xsl:when>
				<xsl:when test="$elementName='param'         and $parentName='attachment'">YES</xsl:when>
				<xsl:when test="$elementName='param'         and $parentName='message'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='log'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='wellLog'">YES</xsl:when>
				<xsl:when test="$elementName='logParam'      and $parentName='blockInfo'">YES</xsl:when>
				<xsl:when test="$elementName='parameter'     and $parentName='projectionx'">YES</xsl:when>
				<xsl:when test="$elementName='anchorTension' and $parentName='rigResponse'">YES</xsl:when>
				<xsl:when test="$elementName='anchorAngle'   and $parentName='rigResponse'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropNamingSystem">
			<!-- Do we need to drop the namingSystem attribute? -->
			<xsl:choose>
				<xsl:when test="not(@namingSystem)">NO</xsl:when>
				<xsl:when test="$elementName='mnemonic'      and $parentName='logCurveInfo'">YES</xsl:when>
				<xsl:when test="$elementName='mnemAlias'     and $parentName='logCurveInfo'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="dropUid">
			<!-- Do we need to drop the uid attribute? -->
			<xsl:choose>
				<xsl:when test="$elementName='bitRecord'">YES</xsl:when>
				<xsl:when test="$elementName='securityInformation'">YES</xsl:when>
				<xsl:when test="$elementName='event'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:variable name="addColumnIndex">
			<!-- Do we need to add the columnIndex attribute? -->
			<xsl:choose>
				<xsl:when test="$elementName='indexCurve' and $parentName='log'">YES</xsl:when>
				<xsl:otherwise>NO</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:if test="$dropIndexedOjectUid='YES'">
			<!-- Add a comment if we will not do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @uid='<xsl:value-of select="./@uid"/>' from-element='<xsl:value-of select="$newName"/>' with index='<xsl:value-of select="@index"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$dropNamingSystem='YES'">
			<!-- Add a comment if we will not do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @namingSystem='<xsl:value-of select="./@namingSystem"/>' from-element='<xsl:value-of select="$newName"/>
				</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$addColumnIndex='YES'">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">ADDED: @columnIndex to-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$elementName!=$newName and $renameUpper!='YES'">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">RENAMED: '<xsl:value-of select="$elementName"/>' to '<xsl:value-of select="$newName"/>'.'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$newValue!='' and  $newValue!=.">
			<!-- Add a comment if we will do something within the element creation. -->
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">CHANGED: '<xsl:value-of select="$newName"/>' value-from '<xsl:value-of select="."/>'.'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="@uid and $dropUid='YES'">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">DELETED: @uid='<xsl:value-of select="@uid"/>' from-element='<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:if test="$elementName='documentInfo'">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">RENAMED: Most descendent elements of documentInfo were renamed from lowerCamelCase to UpperCamelCase.</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
		<xsl:choose>
			<xsl:when test="$keep='YES'">
				<xsl:element name="{$newName}" namespace="{$newNameSpace}">
					<xsl:choose>
						<xsl:when test="$newValue!='' and $newValue!=.">
							<!-- A new value will be used. -->
							<xsl:value-of select="$newValue"/>
						</xsl:when>
						<xsl:when test="$elementName='customData'">
							<!-- Copy all children in the specified namespace. -->
							<xsl:copy-of select="* | text() | @* | comment()"/>
						</xsl:when>
						<xsl:when test="$dropIndexedOjectUid='YES'">
							<!-- Possibly change a value. -->
							<xsl:apply-templates select="." mode="indexedObject-Backward"/>
						</xsl:when>
						<xsl:when test="$addColumnIndex='YES'">
							<!-- Add an attribute. -->
							<xsl:apply-templates select="." mode="indexCurve-log-Backward"/>
						</xsl:when>
						<xsl:when test="$elementName='logCurveInfo' and $parentName='log'">
							<!-- Add some elements. -->
							<xsl:apply-templates select="." mode="logCurveInfo-log-Backward"/>
						</xsl:when>
						<xsl:otherwise>
							<!-- Copy children in new namespace. -->
							<xsl:for-each select="./@*">
								<xsl:choose>
									<xsl:when test="$dropUid='YES' and name()='uid'">
										<!-- Do not copy the uid attribute. -->
									</xsl:when>
									<xsl:when test="$dropNamingSystem='YES' and name()='namingSystem'">
										<!-- Do not copy the namingSystem attribute. -->
									</xsl:when>
									<xsl:otherwise>
										<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
									</xsl:otherwise>
								</xsl:choose>
							</xsl:for-each>
							<xsl:if test="./child::*">
								<xsl:call-template name="linebreak"/>
							</xsl:if>
							<!-- Copy the content of this element either as text or as more element content. -->
							<xsl:apply-templates mode="copy-Backward"/>
						</xsl:otherwise>
					</xsl:choose>
				</xsl:element>
				<xsl:call-template name="linebreak"/>
			</xsl:when>
			<xsl:otherwise>
				<!-- Add a comment that we will not create the element. -->
				<xsl:apply-templates select="." mode="encode-add-comment">
					<xsl:with-param name="string">DELETED:</xsl:with-param>
				</xsl:apply-templates>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="text()" mode="copy-Backward">
		<!-- Copies the text content of an element. -->
		<xsl:value-of select="."/>
	</xsl:template>
	<xsl:template match="*" mode="typeLogData-Backward">
		<xsl:choose>
			<xsl:when test=".='byte'">double</xsl:when>
			<xsl:when test=".='float'">double</xsl:when>
			<xsl:when test=".='int'">double</xsl:when>
			<xsl:when test=".='short'">double</xsl:when>
			<xsl:when test=".='string40'">string</xsl:when>
			<xsl:when test=".='string16'">string</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="."/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="copy-LithologyType-Backward">
		<!-- Copy the element value (possibly renamed). -->
		<xsl:choose>
			<!-- Null value is probably a template. -->
			<xsl:when test=".=''"/>
			<!-- A v141 value that replaced something. -->
			<xsl:when test=".='diamictite'">tillite (diamictite)</xsl:when>
			<xsl:when test=".='greenstone'">greenstones</xsl:when>
			<xsl:when test=".='igneous rock'">igneous</xsl:when>
			<xsl:when test=".='impure dolomite'">dolomite, calcareous</xsl:when>
			<xsl:when test=".='metamorphic rock'">metamorphic rocks</xsl:when>
			<xsl:when test=".='fragmental igneous rock'">extrusive rock (volcanic)</xsl:when>
			<xsl:when test=".='rock salt'">salt</xsl:when>
			<xsl:when test=".='serpentinite'">serpentine</xsl:when>
			<xsl:when test=".='wacke'">greywacke</xsl:when>
			<!--A v131 value. -->
			<xsl:when test=".='arkose' or .='calcarenite' or .='calcilutite' or .='calcisiltite' or .='coal' or 
				.='diabase' or .='diorite' or .='dolomite, calcareous' or .='extrusive rock (volcanic)' or 
				.='feldspar' or .='glauconite' or .='greenstones' or .='greywacke' or .='gumbo' or .='igneous' or 
				.='intrusive rock (plutonic)' or .='limestone, argillaceous' or .='limestone, dolomitic' or 
				.='limestone, sandy' or .='marl' or .='metamorphic rocks' or .='no description' or .='ophiolite' or 
				.='phosphate' or .='phosphate rock' or .='salt' or .='serpentine' or .='syenite' or 
				.='tillite (diamictite)' or .='trachyte' or .='ultrabasic' or .='undifferentiated' or .='unknown'">
				<xsl:value-of select="."/>
			</xsl:when>
			<!-- A v141 value with no mapping. -->
			<xsl:otherwise>unknown</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="copy-QualifierType-Backward">
		<!-- Copy the element value (possibly renamed). -->
		<xsl:choose>
			<!-- Null value is probably a template. -->
			<xsl:when test=".=''"/>
			<!-- A v141 value that replaced something. -->
			<xsl:when test=".='calcite concretion'">calcite concr</xsl:when>
			<xsl:when test=".='coral fragments'">coral</xsl:when>
			<xsl:when test=".='forams'">forams undifferentiated</xsl:when>
			<xsl:when test=".='fossil fragments'">fossil fragment</xsl:when>
			<xsl:when test=".='lithic fragments'">lithic fragment</xsl:when>
			<xsl:when test=".='microfossils'">microfossil</xsl:when>
			<xsl:when test=".='oncoliths'">oncolithic</xsl:when>
			<xsl:when test=".='ooids'">ooid or oolith</xsl:when>
			<xsl:when test=".='pellets'">pelletal</xsl:when>
			<xsl:when test=".='peloids'">peloidal</xsl:when>
			<xsl:when test=".='pisoliths'">pisolith</xsl:when>
			<xsl:when test=".='shell fragments'">shell</xsl:when>
			<xsl:when test=".='spicules'">spicule</xsl:when>
			<xsl:when test=".='stylolites'">stylolitic</xsl:when>
			<!-- A v14+ value with a v131 variant. -->
			<xsl:when test=".='anhydrite'">anhydritic</xsl:when>
			<xsl:when test=".='clay'">argillaceous</xsl:when>
			<xsl:when test=".='belemnites'">belemnitic</xsl:when>
			<xsl:when test=".='bioturbation'">bioturbated</xsl:when>
			<xsl:when test=".='bitumen'">bituminous</xsl:when>
			<xsl:when test=".='burrows'">burrowed</xsl:when>
			<xsl:when test=".='chalk'">chalky</xsl:when>
			<xsl:when test=".='conglomerate'">conglomeratic</xsl:when>
			<xsl:when test=".='gravel'">gravelly</xsl:when>
			<xsl:when test=".='gypsum'">gypsiferous</xsl:when>
			<xsl:when test=".='marl'">marly</xsl:when>
			<xsl:when test=".='ooliths'">ooid or oolith</xsl:when>
			<xsl:when test=".='oolitic'">ooid or oolith</xsl:when>
			<xsl:when test=".='pebble'">pebbly</xsl:when>
			<xsl:when test=".='pellets'">pelletal</xsl:when>
			<xsl:when test=".='peloids'">peloidal</xsl:when>
			<xsl:when test=".='rock salt'">salty</xsl:when>
			<xsl:when test=".='sand'">sandy</xsl:when>
			<xsl:when test=".='silt'">silty</xsl:when>
			<xsl:when test=".='spicules'">spicular</xsl:when>
			<xsl:when test=".='stylolites'">stylolitic</xsl:when>
			<xsl:when test=".='tuff'">tuffaceous</xsl:when>
			<!-- A v14+ value that is a variant of a v131 value (possibly via a deprecated intermediary). -->
			<xsl:when test=".='baritic'">barite</xsl:when>
			<xsl:when test=".='bryozoan'">bryozoans</xsl:when>
			<xsl:when test=".='chamositic'">chamosite</xsl:when>
			<xsl:when test=".='cherty'">chert</xsl:when>
			<xsl:when test=".='chloritic'">chlorite</xsl:when>
			<xsl:when test=".='concretionary'">concretions</xsl:when>
			<xsl:when test=".='crinoidal'">crinoids</xsl:when>
			<xsl:when test=".='diatomaceous'">diatoms</xsl:when>
			<xsl:when test=".='feldsparic'">feldspar</xsl:when>
			<xsl:when test=".='feldspathic'">feldspar</xsl:when>
			<xsl:when test=".='halitic'">halite</xsl:when>
			<xsl:when test=".='illitic'">illite</xsl:when>
			<xsl:when test=".='kaolinitic'">kaolinite</xsl:when>
			<xsl:when test=".='lignitic'">lignite</xsl:when>
			<xsl:when test=".='lithic'">lithic fragment</xsl:when>
			<xsl:when test=".='micaceous'">mica</xsl:when>
			<xsl:when test=".='microfossiliferous'">microfossil</xsl:when>
			<xsl:when test=".='oncolitic'">oncolithic</xsl:when>
			<xsl:when test=".='ostracodal'">ostracods</xsl:when>
			<xsl:when test=".='phosphatic'">phosphate</xsl:when>
			<xsl:when test=".='pisolitic'">pisolite</xsl:when>
			<xsl:when test=".='pyritic'">pyrite</xsl:when>
			<xsl:when test=".='quartiferous'">quartz</xsl:when>
			<xsl:when test=".='radiolarian'">radiolaria</xsl:when>
			<xsl:when test=".='sideritic'">siderite</xsl:when>
			<xsl:when test=".='tuffitic'">tuffite</xsl:when>
			<!-- A v131 value. -->
			<xsl:when test=".='anhydritic' or .='argillaceous' or .='barite' or .='belemnitic' or .='bioturbated' or 
				.='bituminous' or .='bryozoans' or .='burrowed' or .='calcareous' or .='carbonaceous' or 
				.='chalky' or .='chamosite' or .='chert' or .='chlorite' or .='concretions' or .='conglomeratic' or 
				.='crinoids' or .='diatoms' or .='dolomite' or .='dolomite concretion' or .='dolomite stringer' or 
				.='dolomitic' or .='feldspar' or .='ferruginous' or .='fossils undifferentiated' or .='glauconite' or 
				.='glauconitic' or .='gravelly' or .='gypsiferous' or .='halite' or .='illite' or .='kaolinite' or 
				.='lignite' or .='limestone stringer' or .='marly' or .='mica' or .='oncolite' or .='ostracods' or 
				.='pebbly' or .='pelletal' or .='peloidal' or .='phosphate' or .='pisolite' or .='plant remains' or 
				.='pyrite' or .='quartz' or .='radiolaria' or .='salty' or .='sandy' or .='siderite' or 
				.='siderite concretion' or .='silty' or .='spicular' or .='stylolitic' or .='tuffaceous' or .='tuffite' or 
				.='unknown' or .='calcite concr' or .='coral' or .='forams undifferentiated' or .='fossil fragment' or 
				.='lithic fragment' or .='microfossil' or .='oncolith' or .='oncolithic' or .='ooid or oolith' or 
				.='pellet' or .='peloid' or .='pisolith' or .='shell' or .='spicule' or .='stylolite' or .='fissile' or 
				.='no description' or .='none'">
				<xsl:value-of select="."/>
			</xsl:when>
			<!-- A v141 value with no mapping. -->
			<xsl:otherwise>unknown</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="logCurveInfo-log-Backward">
		<!-- Note that "copy-Backward" may delete some items. -->
		<xsl:for-each select="./@*">
			<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
		</xsl:for-each>
		<xsl:call-template name="copy-comment"/>
		<xsl:apply-templates select="w141:mnemonic" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:classWitsml" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:classIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:unit" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:mnemAlias" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:nullValue" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:alternateIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:wellDatum" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:minIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:maxIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:minDateTimeIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:maxDateTimeIndex" mode="copy-Backward"/>
		<xsl:apply-templates select="." mode="columnIndex-log-Backward"/>
		<xsl:apply-templates select="w141:curveDescription" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:sensorOffset" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:dataSource" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:densData" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:traceState" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:traceOrigin" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:typeLogData" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:axisDefinition" mode="copy-Backward"/>
		<xsl:apply-templates select="w141:extensionNameValue" mode="copy-Backward"/>
	</xsl:template>
	<xsl:template match="*" mode="columnIndex-log-Backward">
		<!-- The context is logCurveInfo. -->
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">ADDED: columnIndex </xsl:with-param>
		</xsl:call-template>
		<xsl:variable name="mne">
			<xsl:value-of select="w141:mnemonic"/>
		</xsl:variable>
		<xsl:variable name="mnePos">
			<xsl:call-template name="find-string">
				<xsl:with-param name="string">
					<xsl:value-of select="../w141:logData/w141:mnemonicList"/>
				</xsl:with-param>
				<xsl:with-param name="substring">
					<xsl:value-of select="$mne"/>
				</xsl:with-param>
				<xsl:with-param name="position">1</xsl:with-param>
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="order">
			<xsl:choose>
				<xsl:when test="$mne=''"/>
				<xsl:when test="$mnePos!=''">
					<xsl:value-of select="$mnePos"/>
				</xsl:when>
				<xsl:otherwise>0</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:element name="columnIndex" namespace="{$newNameSpace}">
			<xsl:value-of select="$order"/>
		</xsl:element>
	</xsl:template>
	<xsl:template match="*" mode="indexedObject-Backward">
		<!-- Copy all attributes except the uid. -->
		<xsl:if test="./@index">
			<xsl:attribute name="index"><xsl:value-of select="./@index"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@name">
			<xsl:attribute name="name"><xsl:value-of select="./@name"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@uom">
			<xsl:attribute name="uom"><xsl:value-of select="./@uom"/></xsl:attribute>
		</xsl:if>
		<xsl:if test="./@description">
			<xsl:attribute name="description"><xsl:value-of select="./@description"/></xsl:attribute>
		</xsl:if>
		<xsl:value-of select="."/>
	</xsl:template>
	<xsl:template match="*" mode="indexCurve-log-Backward">
		<!-- Context is log/indexCurve. -->
		<xsl:variable name="mne">
			<xsl:value-of select="."/>
		</xsl:variable>
		<xsl:variable name="mnePos">
			<xsl:call-template name="find-string">
				<xsl:with-param name="string">
					<xsl:value-of select="../w141:logData/w141:mnemonicList"/>
				</xsl:with-param>
				<xsl:with-param name="substring">
					<xsl:value-of select="$mne"/>
				</xsl:with-param>
				<xsl:with-param name="position">1</xsl:with-param>
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="order">
			<xsl:choose>
				<xsl:when test="$mne=''"/>
				<xsl:when test="$mnePos!=''">
					<xsl:value-of select="$mnePos"/>
				</xsl:when>
				<xsl:otherwise>0</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:attribute name="columnIndex"><xsl:value-of select="$order"/></xsl:attribute>
		<xsl:value-of select="$mne"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-RealtimeData-Backward">
		<!-- Copy the element value (possibly renamed). -->
		<xsl:choose>
			<xsl:when test=".='TVD of bit'">TVD of Bit</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="."/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="*" mode="dataGroup-Backward">
		<!-- Create an element for dataGroup. -->
		<xsl:call-template name="add-comment">
			<xsl:with-param name="string">ADDED: dataGroup as copy of ./commonData/serviceCategory.</xsl:with-param>
		</xsl:call-template>
		<xsl:element name="dataGroup" namespace="{$newNameSpace}">
			<xsl:value-of select="."/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--                    Templates for FORWARD DOCUMENT-INFO conversion.                       -->
	<!--                       These templates are direction specific.                            -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template match="w131:SecurityInformation" mode="cs_documentSecurityInfo-FWD">
		<xsl:if test="$mode='write'">
			<xsl:attribute name="uid"><xsl:value-of select="translate(w131:Class,' ','_')"/><xsl:if test="w131:Class!='' and w131:System!=''"><xsl:text>_</xsl:text></xsl:if><xsl:value-of select="translate(w131:System,' ','_')"/><xsl:if test="w131:System!='' or (w131:Class!='' and w131:System='')"><xsl:text>_</xsl:text></xsl:if><xsl:value-of select="translate(w131:EndDate,' ','_')"/></xsl:attribute>
		</xsl:if>
		<xsl:apply-templates mode="copy-Forward"/>
	</xsl:template>
	<xsl:template match="w131:Event" mode="cs_documentEvent-FWD">
		<xsl:if test="$mode='write'">
			<xsl:attribute name="uid"><xsl:value-of select="translate(w131:EventDate,' ','_')"/><xsl:if test="w131:EventDate!='' and w131:ResponsibleParty!=''"><xsl:text>_</xsl:text></xsl:if><xsl:value-of select="translate(w131:ResponsibleParty,' ','_')"/></xsl:attribute>
		</xsl:if>
		<xsl:apply-templates mode="copy-Forward"/>
	</xsl:template>
	<xsl:template match="*" mode="rename-timestamp-FWD">
		<!-- Create an element with the same text content but with a different name and namespace. -->
		<!-- Any attributes will be ignored (i.e., not copied). -->
		<!-- This should NOT be called for container elements. -->
		<xsl:param name="newName"/>
		<xsl:element name="{$newName}" namespace="{$newNameSpace}">
			<xsl:apply-templates select="." mode="timestamp-Forward"/>
			<xsl:call-template name="copy-comment"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
		<xsl:variable name="TIME">
			<xsl:value-of select="substring-after(.,'T')"/>
		</xsl:variable>
		<xsl:if test="contains(.,'T') and not(contains($TIME,'Z') or contains($TIME,'+') or contains($TIME,'-'))">
			<xsl:call-template name="add-comment">
				<xsl:with-param name="string">ADDED: timezone='<xsl:value-of select="$v131TimeZone"/>' to-element=''<xsl:value-of select="$newName"/>'</xsl:with-param>
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!--               These templates are NOT specific to any one object.                        -->
	<!--                  These templates are independent of direction.                           -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<!-- //////////////////////////////////////////////////////////////////////////////////////// -->
	<xsl:template name="linebreak">
		<!-- Inserts a line break. -->
		<xsl:text>
</xsl:text>
	</xsl:template>
	<xsl:template name="add-comment">
		<xsl:param name="string"/>
		<xsl:if test="$omitComment!='YES'">
			<xsl:comment>
				<xsl:value-of select="$string"/>
			</xsl:comment>
		</xsl:if>
	</xsl:template>
	<xsl:template match="*" mode="encode-add-comment">
		<xsl:param name="string"/>
		<xsl:if test="$omitComment!='YES'">
			<xsl:variable name="valueString">
				<xsl:apply-templates select="." mode="copy-value"/>
			</xsl:variable>
			<xsl:comment>
				<xsl:value-of select="$string"/>
				<xsl:value-of select="$valueString"/>
			</xsl:comment>
		</xsl:if>
	</xsl:template>
	<xsl:template match="*" mode="copy-value">
		<!-- Recursive template to copy the name of the element and its value along with the name and value of its attributes and childred. -->
		<xsl:text> </xsl:text>
		<xsl:value-of select="name(.)"/>
		<xsl:text>=</xsl:text>
		<xsl:if test="not(child::*)">
			<xsl:text>'</xsl:text>
			<xsl:value-of select="node()"/>
			<xsl:text>'</xsl:text>
		</xsl:if>
		<xsl:for-each select="./@*">
			<xsl:text> @</xsl:text>
			<xsl:value-of select="name(.)"/>
			<xsl:text>='</xsl:text>
			<xsl:value-of select="."/>
			<xsl:text>'</xsl:text>
		</xsl:for-each>
		<xsl:if test="child::*">
			<xsl:apply-templates select="child::*" mode="copy-value"/>
		</xsl:if>
	</xsl:template>
	<xsl:template name="copy-comment">
		<!-- Copies the child comments of the current node. -->
		<xsl:apply-templates select="./child::comment()" mode="copy-all"/>
	</xsl:template>
	<xsl:template match="comment()" mode="copy-all">
		<!-- Copies the comment content. -->
		<xsl:comment>
			<xsl:value-of select="."/>
		</xsl:comment>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-element">
		<!-- Create an element with the same name and text content but with a new namespace. -->
		<!-- Any attributes will be ignored. -->
		<!-- This should NOT be called for container elements. -->
		<xsl:element name="{name(.)}" namespace="{$newNameSpace}">
			<xsl:value-of select="."/>
			<xsl:call-template name="copy-comment"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="copy-element-with-attribute">
		<!-- Create an element with the same name and text content but with a new namespace. -->
		<!-- Any attributes will be copied. -->
		<!-- This should NOT be called for container elements. -->
		<xsl:element name="{name(.)}" namespace="{$newNameSpace}">
			<xsl:for-each select="./@*">
				<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
			</xsl:for-each>
			<xsl:value-of select="."/>
			<xsl:call-template name="copy-comment"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="rename-element">
		<!-- Create an element with the same text content but with a different name and namespace. -->
		<!-- Any attributes will be ignored (i.e., not copied). -->
		<!-- This should NOT be called for container elements. -->
		<xsl:param name="newName"/>
		<xsl:element name="{$newName}" namespace="{$newNameSpace}">
			<xsl:value-of select="."/>
			<xsl:call-template name="copy-comment"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template match="*" mode="rename-element-with-attribute">
		<!-- Create an element with the same text content but with a different name and namespace. -->
		<!-- Any attributes will be copied. -->
		<!-- This should NOT be called for container elements. -->
		<xsl:param name="newName"/>
		<xsl:element name="{$newName}" namespace="{$newNameSpace}">
			<xsl:for-each select="./@*">
				<xsl:attribute name="{name(.)}"><xsl:value-of select="."/></xsl:attribute>
			</xsl:for-each>
			<xsl:value-of select="."/>
			<xsl:call-template name="copy-comment"/>
		</xsl:element>
		<xsl:call-template name="linebreak"/>
	</xsl:template>
	<xsl:template name="find-string">
		<!-- Recursive template to determine the position of a substring within a comma delimited string. -->
		<xsl:param name="string"/>
		<!-- The nodes whose content is to be concatenated. -->
		<xsl:param name="substring"/>
		<!-- The number of nodes to process. -->
		<xsl:param name="position">1</xsl:param>
		<!-- The next node to process. -->
		<xsl:variable name="delim">,</xsl:variable>
		<xsl:choose>
			<xsl:when test="not(contains($string,$delim)) and $substring=$string">
				<!-- We have found our answer. -->
				<xsl:value-of select="$position"/>
			</xsl:when>
			<xsl:when test="not(contains($string,$delim))">
				<!-- We are finished. Substring not found. -->
			</xsl:when>
			<xsl:otherwise>
				<xsl:variable name="nextvalue">
					<xsl:value-of select="substring-before($string,$delim)"/>
				</xsl:variable>
				<xsl:choose>
					<xsl:when test="$nextvalue=$substring">
						<!-- We have found our answer. -->
						<xsl:value-of select="$position"/>
					</xsl:when>
					<xsl:otherwise>
						<!-- Try the next node to see if it will fit. -->
						<xsl:call-template name="find-string">
							<xsl:with-param name="string">
								<xsl:value-of select="substring-after($string,$delim)"/>
							</xsl:with-param>
							<xsl:with-param name="substring">
								<xsl:value-of select="$substring"/>
							</xsl:with-param>
							<xsl:with-param name="position">
								<xsl:value-of select="$position +1"/>
							</xsl:with-param>
						</xsl:call-template>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
</xsl:transform>
