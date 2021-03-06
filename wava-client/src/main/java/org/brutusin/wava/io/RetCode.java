/*
 * Copyright 2016 Ignacio del Valle Alles idelvall@brutusin.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brutusin.wava.io;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
public enum RetCode {

    ERROR(201601),
    CORE_NOT_RUNNING(201602),
    NOT_WAVA_HOME(201603),
    NOT_ROOT_USER(201604),
    CANCELLED(201605);

    private final int code;

    private RetCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
