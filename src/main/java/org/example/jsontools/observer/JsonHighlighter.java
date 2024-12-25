package org.example.jsontools.observer;

class JsonHighlighter implements JsonObserver {
    @Override
    public void update(String json) {
        System.out.println("Highlighting JSON Schema: " + json);
        highlightSyntax(json);
    }

    private void highlightSyntax(String json) {
        System.out.println("[HIGHLIGHTED] " + json);
    }
}
