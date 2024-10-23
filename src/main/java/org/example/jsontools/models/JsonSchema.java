package org.example.jsontools.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "jsonSchema")
public class JsonSchema {
    @Id
    @Column(name = "schema_id")
    private Long id;

    private String schemaName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_content_id", referencedColumnName = "id")
    private SchemaContent schemaContent;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_id")
    private List<JsonProperty> properties;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_id")
    private List<History> history;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schema_id")
    private List<ValidationError> validationErrors;
}