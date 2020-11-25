package org.relxd.lxd.model;

import java.util.List;

public class Metadata4 {

    private List<String> command;
    private Environment environment;
    private Fds fds;
    private Boolean interactive;

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Fds getFds() {
        return fds;
    }

    public void setFds(Fds fds) {
        this.fds = fds;
    }

    public Boolean getInteractive() {
        return interactive;
    }

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    @Override
    public String toString() {
        return "Metadata4{" +
                "command=" + command +
                ", environment=" + environment +
                ", fds=" + fds +
                ", interactive=" + interactive +
                '}';
    }
}
