package org.relxd.lxd.model;

import org.threeten.bp.LocalDateTime;

public class InstanceByNameResponseMetadata {

    private String id;
    //private String class;
    private String description;
    private String created_at;
    private String updated_at;
    private String status;
    private double status_code;
    private Resources1 resources;
    private Metadata4 metadata;
    private Boolean may_cancel;
    private String err;
    private String location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getStatus_code() {
        return status_code;
    }

    public void setStatus_code(double status_code) {
        this.status_code = status_code;
    }

    public Resources1 getResources() {
        return resources;
    }

    public void setResources(Resources1 resources) {
        this.resources = resources;
    }

    public Metadata4 getMetadata4() {
        return metadata;
    }

    public void setMetadata4(Metadata4 metadata) {
        this.metadata = metadata;
    }

    public Boolean getMay_cancel() {
        return may_cancel;
    }

    public void setMay_cancel(Boolean may_cancel) {
        this.may_cancel = may_cancel;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InstanceByNameResponseMetadata{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", status='" + status + '\'' +
                ", status_code=" + status_code +
                ", resources1=" + resources +
                ", metadata4=" + metadata +
                ", may_cancel=" + may_cancel +
                ", err='" + err + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
