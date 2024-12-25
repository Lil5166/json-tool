package org.example.jsontools.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class JsonEditor {
    private List<JsonObserver> observers = new ArrayList<>();
    private String jsonSchema;

    public void addObserver(JsonObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(JsonObserver observer) {
        observers.remove(observer);
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        notifyObservers();
    }

    public String getJsonSchema() {
        return jsonSchema;
    }

    private void notifyObservers() {
        for (JsonObserver observer : observers) {
            observer.update(jsonSchema);
        }
    }
}