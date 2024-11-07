package com.desafiomagalu.desafiomagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiomagalu.desafiomagalu.domain.channel.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long>{
    
}
