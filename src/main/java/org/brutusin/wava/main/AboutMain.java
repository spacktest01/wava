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
package org.brutusin.wava.main;

import java.io.File;
import org.brutusin.wava.core.Environment;
import org.brutusin.wava.utils.ANSICode;
import org.brutusin.wava.utils.Utils;

/**
 *
 * @author Ignacio del Valle Alles idelvall@brutusin.org
 */
public class AboutMain {

    public static void main(String[] args) throws Exception {
        System.err.println(Utils.getLogo());
        System.err.println(ANSICode.CYAN.getCode() + "Version:\n\t" + ANSICode.RESET.getCode() + Utils.getVersion() + " (" + Utils.getBuildDate() + ")");
        System.err.println(ANSICode.CYAN.getCode() + "Project site:\n\t" + ANSICode.RESET.getCode() + "http://wava.brutusin.org");
        System.err.println(ANSICode.CYAN.getCode() + "Created by:\n\t" + ANSICode.RESET.getCode() + "Ignacio del Valle Alles");
        System.err.println(ANSICode.CYAN.getCode() + "Offline help:\n\t" + ANSICode.RESET.getCode() + "more " + new File(Environment.ROOT, "README").getAbsolutePath());
    }
}