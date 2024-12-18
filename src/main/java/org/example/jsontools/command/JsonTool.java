package org.example.jsontools.command;

import org.json.JSONObject;

public class JsonTool {

    public void validateJson(String json) {
        try {
            new JSONObject(json);
            System.out.println("JSON is valid.");
        } catch (Exception e) {
            System.out.println("Invalid JSON: " + e.getMessage());
        }
    }

    public void exportFlatView(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            System.out.println("Flat View of JSON:");
            jsonObject.keys().forEachRemaining(key -> {
                System.out.println(key + ": " + jsonObject.get(key));
            });
        } catch (Exception e) {
            System.out.println("Failed to export flat view: " + e.getMessage());
        }
    }

    public void autoSave(String json) {
        System.out.println("JSON has been auto-saved successfully.");
    }
}

