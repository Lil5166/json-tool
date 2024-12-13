package org.example.jsontools.strategy;

import org.json.JSONObject;

public class JsonToolDemo {
    public static void main(String[] args) {
        String validJsonString = """
            {
                "name": "John",
                "age": 30,
                "email": "john@example.com"
            }
        """;

        String invalidJsonString = """
            {
                "name": "John",
                "age": "thirty",
                "email": "john@example.com"
            }
        """;

        String schemaString = """
            {
                "$schema": "http://json-schema.org/draft-07/schema#",
                "type": "object",
                "properties": {
                    "name": { "type": "string" },
                    "age": { "type": "integer" },
                    "email": { "type": "string", "format": "email" }
                },
                "required": ["name", "age", "email"]
            }
        """;

        JSONObject validJson = new JSONObject(validJsonString);
        JSONObject invalidJson = new JSONObject(invalidJsonString);
        JSONObject schema = new JSONObject(schemaString);

        JsonValidator validator = new JsonValidator();

        System.out.println("Using SchemaValidationStrategy with valid JSON:");
        validator.setStrategy(new SchemaValidationStrategy());
        validator.validate(validJson, schema);

        System.out.println("\nUsing SchemaValidationStrategy with invalid JSON:");
        validator.validate(invalidJson, schema);

        System.out.println("\nUsing StructureValidationStrategy with valid JSON:");
        validator.setStrategy(new StructureValidationStrategy());
        validator.validate(validJson, schema);

        System.out.println("\nUsing StructureValidationStrategy with invalid JSON:");
        validator.validate(invalidJson, schema);
    }
}

