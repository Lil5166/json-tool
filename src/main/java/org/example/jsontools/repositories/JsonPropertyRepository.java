package org.example.jsontools.repositories;

import org.example.jsontools.models.JsonProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JsonPropertyRepository extends JpaRepository<JsonProperty, Long> {
    //List<JsonProperty> findBySchemaId(Long schemaId);
}
