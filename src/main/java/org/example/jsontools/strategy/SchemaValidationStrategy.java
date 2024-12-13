package org.example.jsontools.strategy;

import org.json.JSONObject;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;

public class SchemaValidationStrategy implements ValidationStrategy {
    @Override
    public void validate(JSONObject json, JSONObject schema) {
        try {
            Schema jsonSchema = SchemaLoader.load(schema);
            jsonSchema.validate(json);
            System.out.println("JSON is valid.");
        } catch (ValidationException e) {
            System.out.println("JSON is invalid: " + e.getMessage());
            for (ValidationException causingException : e.getCausingExceptions()) {
                System.out.println(" - " + causingException.getMessage());
            }
        }
    }
}


