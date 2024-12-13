package org.example.jsontools.strategy;
import org.json.JSONObject;

public interface ValidationStrategy {
    void validate(JSONObject json, JSONObject schema);
}

