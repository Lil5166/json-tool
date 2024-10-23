package org.example.jsontools.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "schemaContent")
public class SchemaContent {
    @Id
    private Long id;

    @Lob
    private String content;
}