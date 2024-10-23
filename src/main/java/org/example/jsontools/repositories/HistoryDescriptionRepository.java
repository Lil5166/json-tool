package org.example.jsontools.repositories;

import org.example.jsontools.models.HistoryDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryDescriptionRepository extends JpaRepository<HistoryDescription, Long> {
}
