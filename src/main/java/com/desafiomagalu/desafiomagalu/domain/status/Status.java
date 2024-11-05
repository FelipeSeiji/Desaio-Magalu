package com.desafiomagalu.desafiomagalu.domain.status;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "status")
public class Status {
    
    private Long statusId;

    private String description;
}
