package com.desafiomagalu.desafiomagalu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiomagalu.desafiomagalu.DTO.NotificationDTO;
import com.desafiomagalu.desafiomagalu.Service.NotificationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notification")
public class NotificationController {

    private NotificationService notificationService;
    @PostMapping
    public ResponseEntity<Void> postMethodName(@RequestBody NotificationDTO dto) {
        notificationService.sendNotifications(dto);
        return ResponseEntity.accepted().build();
    }
    
}
