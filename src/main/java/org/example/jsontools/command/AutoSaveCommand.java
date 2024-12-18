package org.example.jsontools.command;

public class AutoSaveCommand implements Command{
    private JsonTool jsonTool;
    private String json;

    public AutoSaveCommand(JsonTool jsonTool, String json) {
        this.jsonTool = jsonTool;
        this.json = json;
    }

    public void execute() {
        jsonTool.autoSave(json);
    }
}
