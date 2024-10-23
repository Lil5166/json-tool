package org.example.jsontools.repositories;

import org.example.jsontools.models.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
   //List<History> findBySchemaId(Long schemaId);
}
