package org.example.jsontools.repositories;

import org.example.jsontools.models.SchemaContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchemaContentRepository extends JpaRepository<SchemaContent, Long> {
}
