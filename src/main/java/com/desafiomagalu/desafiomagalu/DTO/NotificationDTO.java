package com.desafiomagalu.desafiomagalu.DTO;

import java.time.LocalDateTime;

import com.desafiomagalu.desafiomagalu.domain.channel.ChannelType;
import com.desafiomagalu.desafiomagalu.domain.notification.Notification;
import com.desafiomagalu.desafiomagalu.domain.status.StatusType;

public record NotificationDTO(LocalDateTime dateTime, String destination, String message, ChannelType channel) {
    public Notification toNotification(){
        return new Notification(dateTime, destination, message, channel.toChannel(), StatusType.PENDING.toStatus());
    }
}
