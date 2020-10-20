package org.relxd.lxd.service.linuxCmd;

import java.io.IOException;
import java.util.List;

public interface LinuxCmdService {

    /**
     * Execute a linux command
     */
     String executeLinuxCmd(String cmd) throws IOException, InterruptedException;

    /**
     * Execute a linux command returning the a list of Strings as a result
     */
    List<String> executeLinuxCmdWithResultLines(String cmd) throws IOException, InterruptedException;

    /**
     * Execute a linux command returning the result as a json object
     */
    <T> T executeLinuxCmdWithResultJsonObject(String cmd, Class<T> classType) throws IOException, InterruptedException;

}
