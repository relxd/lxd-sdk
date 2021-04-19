package org.relxd.lxd.util;

import static org.apache.commons.lang3.SystemUtils.OS_NAME;

public class Constants {
    public static final int RE_LXD_EXEC_TIMEOUT = Integer.parseInt(System.getProperty("relxd.timeout", "30000"));
    public static final boolean IS_WINDOWS = OS_NAME.toLowerCase().startsWith("win");
}
