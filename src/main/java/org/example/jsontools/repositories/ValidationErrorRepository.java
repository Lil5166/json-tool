package org.example.jsontools.repositories;

import org.example.jsontools.models.ValidationError;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationErrorRepository extends JpaRepository<ValidationError, Long> {
}
