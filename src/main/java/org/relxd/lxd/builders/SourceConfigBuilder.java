//todo - add licence information to all the classes

package org.relxd.lxd.builders;

import org.relxd.lxd.model.Properties;
import org.relxd.lxd.model.Secrets;

import java.sql.Blob;
import java.util.HashMap;
import java.util.Map;

/**
 * https://github.com/lxc/lxd/blob/master/doc/instances.md#/1.0/instances source for POST request.
 * This class is used to provide source config information which will be used during container creation.
 */
public class SourceConfigBuilder {

    private Map<String, Object> configs = new HashMap<>();

    /**
     * Can be: "image", "migration", "copy" or "none"
     * @param type
     * @return
     */
    public SourceConfigBuilder setType(String type) {
        configs.put("type", type);
        return this;
    }

    /**
     * One of "local" (default) or "pull"
     * @param mode
     * @return
     */
    public SourceConfigBuilder setMode(String mode) {
        configs.put("mode", mode);
        return this;
    }

    /**
     * Full URL to the remote operation (pull mode only)
     * @param operation
     * @return
     */
    public SourceConfigBuilder setOperation(String operation) {
        configs.put("operation", operation);
        return this;
    }

    /**
     * Optional PEM certificate. If not mentioned, system CA is used.
     * @param certificate
     * @return
     */
    public SourceConfigBuilder setCertificate(String certificate) {
        configs.put("certificate", certificate);
        return this;
    }

    /**
     * Optional, the base image the instance was created from
     * @param baseImageFingerprint
     * @return
     */
    public SourceConfigBuilder setBaseImage(String baseImageFingerprint) {
        configs.put("base-image", baseImageFingerprint);
        return this;
    }

    /**
     * Whether to migrate only the instance without snapshots. Can be "true" or "false".
     * @param instanceOnly
     * @return
     */
    public SourceConfigBuilder setInstanceOnly(boolean instanceOnly) {
        configs.put("instance_only", instanceOnly);
        return this;
    }

    /**
     * Secrets to use when talking to the migration source
     * @param secrets
     * @return
     */
    public SourceConfigBuilder setSecrets(Secrets secrets) {
        configs.put("secrets", secrets);
        return this;
    }

    /**
     * Name of the source instance
     * @param source
     * @return
     */
    public SourceConfigBuilder setSource(String source) {
        configs.put("source", source);
        return this;
    }

    /**
     * Whether migration is performed live
     * @param live
     * @return
     */
    public SourceConfigBuilder setLive(boolean live) {
        configs.put("live", live);
        return this;
    }

    /**
     * Remote server (pull mode only)
     * @param server
     * @return
     */
    public SourceConfigBuilder setServer(String server) {
        configs.put("server", server);
        return this;
    }

    /**
     * Secret to use to retrieve the image (pull mode only)
     * @param secret
     * @return
     */
    public SourceConfigBuilder setSecret(String secret) {
        configs.put("secret", secret);
        return this;
    }

    /**
     * Name of the alias
     * @param alias
     * @return
     */
    public SourceConfigBuilder setAlias(String alias) {
        configs.put("alias", alias);
        return this;
    }

    /**
     * Protocol (one of lxd or simplestreams, defaults to lxd)
     * @param protocol
     * @return
     */
    public SourceConfigBuilder setProtocol(String protocol) {
        configs.put("protocol", protocol);
        return this;
    }

    /**
     * Properties
     * @param properties
     * @return
     */
    public SourceConfigBuilder setProperties(Properties properties) {
        configs.put("properties", properties);
        return this;
    }

    /**
     * Fingerprint
     * @param fingerprint
     * @return
     */
    public SourceConfigBuilder setFingerprint(String fingerprint) {
        configs.put("fingerprint", fingerprint);
        return this;
    }


    public Map<String, Object> asMap () {
            return configs;
    }
}
