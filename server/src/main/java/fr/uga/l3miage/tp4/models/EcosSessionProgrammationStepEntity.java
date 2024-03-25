package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;
    private final LocalDateTime dateTime = null;
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private String description;
    
}