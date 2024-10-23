package org.example.jsontools.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ValidationErrorManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void addValidationError(ValidationError error) {
    }

    public List<ValidationError> getValidationErrors(Long schemaId) {
        return null;
    }
    @OneToOne
    @JoinColumn(name = "validation_error_id")
    private ValidationError validationError;
}