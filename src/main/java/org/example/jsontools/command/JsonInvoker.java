package org.example.jsontools.command;

public class JsonInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        if (command != null) {
            command.execute();
        }
    }
}

