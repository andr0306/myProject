package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entity.TeamEntity;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {

}
