package org.example.jsontools.command;

public class JsonToolDemo {
    public static void main(String[] args) {
        JsonTool jsonTool = new JsonTool();
        JsonInvoker invoker = new JsonInvoker();

        String sampleJson = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";
        System.out.println("Sample JSON: " + sampleJson);

        Command validateCommand = new ValidateJsonCommand(jsonTool, sampleJson);
        invoker.setCommand(validateCommand);
        invoker.invoke();

        Command exportCommand = new ExportFlatJsonCommand(jsonTool, sampleJson);
        invoker.setCommand(exportCommand);
        invoker.invoke();

        Command autoSaveCommand = new AutoSaveCommand(jsonTool, sampleJson);
        invoker.setCommand(autoSaveCommand);
        invoker.invoke();
    }
}

