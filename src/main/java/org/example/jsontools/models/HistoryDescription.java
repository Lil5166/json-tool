package org.example.jsontools.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "historyDescription")
public class HistoryDescription {
    @Id
    private Long id;
    private String description;
}
