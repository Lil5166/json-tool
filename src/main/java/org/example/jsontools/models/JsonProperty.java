package org.example.jsontools.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "jsonProperty")
public class JsonProperty {
    @Id
    private Long id;

    private String propertyName;
    private String description;
    private String example;
    private String dataType;
    private String format;

    @ManyToOne
    @JoinColumn(name = "schema_id")
    private JsonSchema jsonSchema;
}
