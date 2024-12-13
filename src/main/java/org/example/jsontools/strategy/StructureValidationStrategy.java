package org.example.jsontools.strategy;

import org.json.JSONObject;

public class StructureValidationStrategy implements ValidationStrategy {
    @Override
    public void validate(JSONObject json, JSONObject schema) {
        for (String key : schema.keySet()) {
            if (!json.has(key)) {
                System.out.println("JSON is invalid: Missing key " + key);
                return;
            }
        }
        System.out.println("JSON structure is valid.");
    }
}

