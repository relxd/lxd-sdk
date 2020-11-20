//todo - add licence information to all the classes

package org.relxd.lxd.builders;

import java.util.HashMap;
import java.util.Map;

/**
 * https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration
 * This class is used to provide config information which will be used during container creation.
 */
public class InstanceConfigBuilder {

    private Map<String, Object> configs = new HashMap<>();

    /**
     * Always start the instance when LXD starts (if not set, restore last state)
     * Live Update: N/A
     * @param bootAutoStart
     * @return
     */
    public InstanceConfigBuilder setBootAutoStart(boolean bootAutoStart) {
        configs.put("boot.autostart", bootAutoStart);
        return this;
    }

    //todo - finish me - add other configs

    public Map<String, Object> asMap () {
            return configs;
    }
}
