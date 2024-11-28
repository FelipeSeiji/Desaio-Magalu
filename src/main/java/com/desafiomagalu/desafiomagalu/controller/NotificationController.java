package com.desafiomagalu.desafiomagalu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiomagalu.desafiomagalu.DTO.NotificationDTO;
import com.desafiomagalu.desafiomagalu.domain.notification.Notification;
import com.desafiomagalu.desafiomagalu.service.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notification")
public class NotificationController {
    
    @Autowired
    private NotificationService notificationService;
    
    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationDTO dto) {
        notificationService.sendNotifications(dto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable("notificationId") Long notificationId){
        var notification = notificationService.findById(notificationId);

        if (notification.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(notification.get());
    }
    
}
