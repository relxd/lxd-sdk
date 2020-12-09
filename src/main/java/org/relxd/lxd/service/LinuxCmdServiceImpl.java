/*
 *
 * MIT License
 *
 * Copyright (c) 2020 ReLxd
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.relxd.lxd.service;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.relxd.lxd.util.Constants;
import org.relxd.lxd.util.ProcessWithTimeOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LinuxCmdServiceImpl implements LinuxCmdService{

    private static final Logger LOG = Logger.getLogger(LinuxCmdServiceImpl.class);

    @Override
    public String executeLinuxCmd(String cmd) throws IOException, InterruptedException {
        StringBuffer result = new StringBuffer();
        BufferedReader in = null;
        LOG.debug("cmd=" + cmd);
        try {
            Process process = null;
            if (Constants.IS_WINDOWS) {
                LOG.warn("Trying to execute linux command in Windows environment: " + cmd);
                process = Runtime.getRuntime().exec(cmd);
            }
            else {
                String[] cmdArray = { "/bin/sh", "-c", cmd };
                process = Runtime.getRuntime().exec(cmdArray);
            }
            ProcessWithTimeOut processWithTimeout = new ProcessWithTimeOut(process);
            int exitCode = processWithTimeout.waitForProcess(Constants.RE_LXD_EXEC_TIMEOUT);
            if (exitCode == Integer.MIN_VALUE) {
                throw new InterruptedException("Timeout occured in command: " + cmd);
            }
            in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            process.waitFor();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        LOG.debug("result=" + result);
        return result.toString();
    }

    @Override
    public List<String> executeLinuxCmdWithResultLines(String cmd) throws IOException, InterruptedException {
        String[] cmdArray = { "/bin/sh", "-c", cmd };
        LOG.debug("cmd=" + cmdArray[2]);
        List<String> result = new ArrayList<String>();
        BufferedReader in = null;
        LOG.debug("cmd=" + cmdArray[2]);
        try {
            Process process = Runtime.getRuntime().exec(cmdArray);
            in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = in.readLine()) != null) {
                result.add(line);
            }
            process.waitFor();
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return result;
    }

    @Override
    public <T> T executeLinuxCmdWithResultJsonObject(String cmd, Class<T> classType) throws IOException, InterruptedException {
            String output = executeLinuxCmd(cmd);
            if (output.trim().length() > 0) {
                LOG.debug("output=" + output);
                Gson gson = new Gson();
                return gson.fromJson(output, classType);
            }
            return null;
    }
}
