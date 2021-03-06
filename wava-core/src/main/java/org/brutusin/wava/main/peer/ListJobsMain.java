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
package org.brutusin.wava.main.peer;

import org.brutusin.wava.core.io.CommandLineRequestExecutor;
import org.brutusin.wava.input.ListJobsInput;
import org.brutusin.wava.utils.CoreUtils;
import org.brutusin.wava.io.OpName;
import org.brutusin.wava.io.RetCode;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
public class ListJobsMain {

    public static void main(String[] args) throws Exception {
        CoreUtils.validateCoreRunning();
        ListJobsInput input = new ListJobsInput();
        input.setNoHeaders(args.length > 0 && (args[0].equals("-h") || args[0].equals("--no-headers")));
        Integer retCode = new CommandLineRequestExecutor().executeRequest(OpName.jobs, input);
        if (retCode == null) {
            retCode = RetCode.ERROR.getCode();
        }
        System.exit(retCode);
    }
}
