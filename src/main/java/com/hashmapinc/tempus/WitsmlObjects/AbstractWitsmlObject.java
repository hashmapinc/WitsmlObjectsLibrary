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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class AbstractWitsmlObject {
    String name;
    String uid;
    String parentUid;

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