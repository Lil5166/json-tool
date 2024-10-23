package org.example.jsontools.repositories;

import org.example.jsontools.models.ValidationErrorManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValidationErrorManagerRepository extends JpaRepository<ValidationErrorManager, Long> {
    //List<ValidationErrorManager> findBySchemaId(Long schemaId);
}
