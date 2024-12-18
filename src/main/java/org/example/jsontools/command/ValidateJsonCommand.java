package org.example.jsontools.command;

public class ValidateJsonCommand implements Command {
    private JsonTool jsonTool;
    private String json;

    public ValidateJsonCommand(JsonTool jsonTool, String json) {
        this.jsonTool = jsonTool;
        this.json = json;
    }

    public void execute() {
        jsonTool.validateJson(json);
    }
}

