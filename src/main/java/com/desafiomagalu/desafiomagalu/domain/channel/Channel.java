package com.desafiomagalu.desafiomagalu.domain.channel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_channel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Channel {
    @Id
    private Long channelId;

    private String description;
}
