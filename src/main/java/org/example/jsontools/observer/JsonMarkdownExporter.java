package org.example.jsontools.observer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

class JsonMarkdownExporter implements JsonObserver {
    @Override
    public void update(String json) {
        System.out.println("Exporting JSON Schema to Markdown: " + json);
        String markdown = exportToMarkdown(json);
        System.out.println(markdown);
    }

    private String exportToMarkdown(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Object jsonObject = mapper.readValue(json, Object.class);
            ObjectWriter writer = mapper.writer(SerializationFeature.INDENT_OUTPUT);
            String prettyJson = writer.writeValueAsString(jsonObject);
            return "# JSON Schema\n```json\n" + prettyJson + "\n```";
        } catch (Exception e) {
            e.printStackTrace();
            return "# JSON Schema\n```json\n" + json + "\n```";
        }
    }
}
