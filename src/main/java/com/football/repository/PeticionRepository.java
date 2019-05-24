package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.entity.PeticionEntity;

@Repository
public interface PeticionRepository extends JpaRepository<PeticionEntity, Integer>{

}
