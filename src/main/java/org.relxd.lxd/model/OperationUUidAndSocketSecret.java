package org.relxd.lxd.model;

public class OperationUUidAndSocketSecret {
    private String operationUuid;
    private String socketSecret;

    public String getOperationUuid() {
        return operationUuid;
    }

    public void setOperationUuid(String operationUuid) {
        this.operationUuid = operationUuid;
    }

    public String getSocketSecret() {
        return socketSecret;
    }

    public void setSocketSecret(String socketSecret) {
        this.socketSecret = socketSecret;
    }

    @Override
    public String toString() {
        return "OperationUUidAndSocketSecret{" +
                "operationUuid='" + operationUuid + '\'' +
                ", socketSecret='" + socketSecret + '\'' +
                '}';
    }
}
