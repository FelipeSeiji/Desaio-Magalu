package com.desafiomagalu.desafiomagalu.Service;

import org.springframework.stereotype.Service;

import com.desafiomagalu.desafiomagalu.DTO.NotificationDTO;
import com.desafiomagalu.desafiomagalu.repository.NotificationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;
    public void sendNotifications(NotificationDTO dto){
        notificationRepository.save(dto.toNotification());
    }
}
