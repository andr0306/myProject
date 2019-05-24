package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entity.TeamU21Entity;

@Repository
public interface TeamU21Repository extends JpaRepository<TeamU21Entity, Integer>{

}
