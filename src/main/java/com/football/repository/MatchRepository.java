package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entity.MatchEntity;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Integer>{

}
