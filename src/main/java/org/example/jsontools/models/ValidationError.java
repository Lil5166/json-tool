package org.example.jsontools.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "validationError")
public class ValidationError {
    @Id
    @Column(name = "validation_error_id")
    private Long id;
    private String errorMessage;
    private String field;
    private String invalidValue;
    @ManyToOne
    @JoinColumn(name = "schema_id")
    private JsonSchema jsonSchema;
}