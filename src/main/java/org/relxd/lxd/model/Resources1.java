package org.relxd.lxd.model;

import java.util.List;

public class Resources1 {

    List<String> containers;
    List<String> instances;

    public List<String> getContainers() {
        return containers;
    }

    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    public List<String> getInstances() {
        return instances;
    }

    public void setInstances(List<String> instances) {
        this.instances = instances;
    }

    @Override
    public String toString() {
        return "Resources1{" +
                "containers=" + containers +
                ", instances=" + instances +
                '}';
    }
}
