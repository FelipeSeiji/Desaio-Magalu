package com.desafiomagalu.desafiomagalu.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.desafiomagalu.desafiomagalu.domain.channel.ChannelType;
import com.desafiomagalu.desafiomagalu.domain.status.StatusType;
import com.desafiomagalu.desafiomagalu.repository.ChannelRepository;
import com.desafiomagalu.desafiomagalu.repository.StatusRepository;

@Configuration
public class DataLoader implements CommandLineRunner{

    private final ChannelRepository channelRepository;

    private final StatusRepository statusRepository;

    
    public DataLoader(ChannelRepository channelRepository, StatusRepository statusRepository) {
        this.channelRepository = channelRepository;
        this.statusRepository = statusRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(ChannelType.values()).map(ChannelType::toChannel).forEach(channelRepository::save);
        Arrays.stream(StatusType.values()).map(StatusType::toStatus).forEach(statusRepository::save);
    }
}