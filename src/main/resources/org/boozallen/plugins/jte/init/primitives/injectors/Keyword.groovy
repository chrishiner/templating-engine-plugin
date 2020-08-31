/*
    Copyright 2018 Booz Allen Hamilton

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/
package org.boozallen.plugins.jte.init.primitives.injectors

import org.boozallen.plugins.jte.init.primitives.TemplateException
import org.boozallen.plugins.jte.init.primitives.TemplatePrimitive

/**
 * JTE primitive that represents a pre-populated variable
 */
class Keyword extends TemplatePrimitive implements Serializable{

    private static final long serialVersionUID = 1L
    String keyword
    Object value
    String preLockException = "Variable ${keyword} already exists as a Keyword."
    String postLockException = "Variable ${keyword} is reserved as a template Keyword."

    Object getValue(){
        return value
    }

    void throwPreLockException(){
        throw new TemplateException(preLockException)
    }

    void throwPostLockException(){
        throw new TemplateException(postLockException)
    }

}
