/**
 * Copyright © 2018-2018 Hashmap, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hashmapinc.tempus.WitsmlObjects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractWitsmlObject {
    //=========================================================================
    // default implementations for all concrete subclasses
    //=========================================================================
    /**
     * This function provides a string representation of the object
     * 
     * @return stringRep - string representing this object
     */
    public String toString() {
        return (
            "<AbstractWitsmlObject " + 
            "[name=" + this.getName() + "]" +
            "[version=" + this.getVersion() + "]" +
            "[uid=" + this.getUid() + "]" +
            "[parentUID=" + this.getParentUid() + "]" +
            "[objectType=" + this.getObjectType() + "]" +
            ">"
        );
    }

    /**
     * This function inspects the concrete Class name and extracts
     * a 'type' string from that name based on the conventional
     * object class naming of "Obj<Type>".
     * 
     * @return type -   String value with the object type, or 
     *                  null if a type cannot be determined
     */
    @JsonIgnore
    public String getObjectType() {
        // Validate the className. The pattern is "Obj<type>"
        String className = this.getClass().getSimpleName();
        boolean isValidClassname = (
            className.substring(0, 3).equals("Obj") && 
            !className.substring(3).isEmpty()
        );

        // get the type if the classname is valid, otherwise null
        String type = isValidClassname ? className.substring(3) : null;
        return type.toLowerCase();
    }

    /**
     * This function will try to return the parentUid. If one does not exist, then
     * null is returned.
     * 
     * @return parentUid - String value with the parentUid if it exists, otherwise
     *         null
     */
    public String getParentUid() {
        return null;
    };
    // =========================================================================


    // =========================================================================
    // empty functions to be implemented by subclasses
    // =========================================================================

    /**
     * This function returns a json string of the concrete object that
     * implements this abstract class in the requested version.
     * 
     * @param version - String containing the WITSML version to return the string in
     * @return type - String value of this object in json format
     */
    public abstract String getJSONString(String version);

    /**
     * This function returns an xml string of the concrete object that implements
     * this abstract class in the requested version.
     * 
     * @param version - String containing the WITSML version to return the string in
     * @return type - String value of this object in json format
     */
    public abstract String getXMLString(String version);

    /**
     * This function returns the uid of the object
     * 
     * @return uid - String value of the uid
     */
    public abstract String getUid();

    /**
     * This function returns the witsml version of the object
     * 
     * @return uid - String value of the WITMSL version, i.e. "1.3.1.1"
     */
    @JsonIgnore
    public abstract String getVersion();

    /**
     * This function returns the name of the object
     * 
     * @return name - String value of the object name
     */
    public abstract String getName();
    // =========================================================================
}