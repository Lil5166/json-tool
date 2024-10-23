package org.example.jsontools.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "history")
public class History {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "description_id")
    private HistoryDescription description;
}