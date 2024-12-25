package org.example.jsontools.observer;

class JsonValidator implements JsonObserver {
    @Override
    public void update(String json) {
        System.out.println("Validating JSON Schema: " + json);
        if (isValidJson(json)) {
            System.out.println("JSON Schema is valid.");
        } else {
            System.out.println("JSON Schema is invalid.");
        }
    }

    private boolean isValidJson(String json) {
        return json.contains("title");
    }
}

