package org.example.jsontools.observer;

public class JsonToolDemo {
    public static void main(String[] args) {
        JsonEditor jsonEditor = new JsonEditor();

        JsonValidator validator = new JsonValidator();
        JsonHighlighter highlighter = new JsonHighlighter();
        JsonMarkdownExporter exporter = new JsonMarkdownExporter();

        jsonEditor.addObserver(validator);
        jsonEditor.addObserver(highlighter);
        jsonEditor.addObserver(exporter);

        jsonEditor.setJsonSchema("{ \"title\": \"Example Schema\" }");
    }
}