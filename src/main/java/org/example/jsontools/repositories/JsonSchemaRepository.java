package org.example.jsontools.repositories;

import org.example.jsontools.models.JsonSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonSchemaRepository extends JpaRepository<JsonSchema, Long> {
}
