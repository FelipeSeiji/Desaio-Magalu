package com.desafiomagalu.desafiomagalu.domain.status;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StatusType {
    PENDING(1L, "pending"),
    SUCCESS(2L, "success"),
    ERROR(3L, "error"),
    CANCELLED(4L, "cancelled");

    private Long id;

    private String description;

    public Status toStatus(){
        return new Status(id, description);
    }
}
