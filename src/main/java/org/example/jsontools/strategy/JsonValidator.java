package org.example.jsontools.strategy;

import org.json.JSONObject;

public class JsonValidator {
    private ValidationStrategy strategy;

    public void setStrategy(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public void validate(JSONObject json, JSONObject schema) {
        if (strategy == null) {
            throw new IllegalStateException("Validation strategy is not set!");
        }
        strategy.validate(json, schema);
    }
}

