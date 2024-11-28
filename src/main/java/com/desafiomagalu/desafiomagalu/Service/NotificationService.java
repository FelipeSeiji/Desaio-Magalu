package com.desafiomagalu.desafiomagalu.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafiomagalu.desafiomagalu.DTO.NotificationDTO;
import com.desafiomagalu.desafiomagalu.domain.notification.Notification;
import com.desafiomagalu.desafiomagalu.repository.NotificationRepository;


@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Transactional
    public void sendNotifications(NotificationDTO dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }
}
