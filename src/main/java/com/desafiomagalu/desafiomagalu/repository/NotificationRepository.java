package com.desafiomagalu.desafiomagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiomagalu.desafiomagalu.domain.notification.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{
    
}
