package org.example.jsontools.command;

public class ExportFlatJsonCommand implements Command {
    private JsonTool jsonTool;
    private String json;

    public ExportFlatJsonCommand(JsonTool jsonTool, String json) {
        this.jsonTool = jsonTool;
        this.json = json;
    }

    @Override
    public void execute() {
        jsonTool.exportFlatView(json);
    }
}

