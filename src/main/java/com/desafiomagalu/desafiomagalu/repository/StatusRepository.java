package com.desafiomagalu.desafiomagalu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiomagalu.desafiomagalu.domain.status.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{
    
}
