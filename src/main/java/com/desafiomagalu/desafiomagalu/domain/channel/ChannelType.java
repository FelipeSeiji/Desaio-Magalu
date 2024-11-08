package com.desafiomagalu.desafiomagalu.domain.channel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ChannelType {
    EMAIL(1L, "email"),
    SMS(2L, "sms"),
    PUSH(3L, "push"),
    WHATSAPP(4L, "whatapp");

    private Long id;

    private String description;

    public Channel toChannel() {
        return new Channel(id, description);
    }
}