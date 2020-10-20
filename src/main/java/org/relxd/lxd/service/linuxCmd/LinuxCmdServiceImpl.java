package org.relxd.lxd.service.linuxCmd;

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
