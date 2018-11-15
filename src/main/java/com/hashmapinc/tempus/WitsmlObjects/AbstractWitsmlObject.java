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

public abstract class AbstractWitsmlObject {
    protected String name;
    protected String uid;

    /**
     * This function will try to return the parentUid. If one does not exist, then
     * null is returned.
     * 
     * @return parentUid - String value with the parentUid if it exists, otherwise null
     */
    public String getParentUid() {
        return null; // default behavior if not overridden
    }

    /**
     * This function inspects the concrete Class name and extracts
     * a 'type' string from that name based on the conventional
     * object class naming of "Obj<Type>".
     * 
     * @return type -   String value with the object type, or 
     *                  null if a type cannot be determined
     */
    public String getObjectType() {
        // Validate the className. The pattern is "Obj<type>"
        String className = this.getClass().getSimpleName();
        boolean isValidClassname = (
            className.substring(0, 3).equals("Obj") && 
            !className.substring(3).isEmpty()
        );

        // get the type if the classname is valid, otherwise null
        String type = isValidClassname ? className.substring(3) : null;
        return type;
    }
}