/* ***************************************************************************
 * Copyright 2017 Ellucian Company L.P. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

package net.hedtech.restfulapi


/**
 * Result from extending request and response content. Contains the
 * extended content and indicators on how the content was extended.
 * Please see README.md for a full explanation.
 **/
class ContentExtensionResult {


    def content
    boolean wasExtended = false

}
