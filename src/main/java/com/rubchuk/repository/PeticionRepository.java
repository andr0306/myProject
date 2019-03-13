package com.rubchuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubchuk.entity.PeticionEntity;

@Repository
public interface PeticionRepository extends JpaRepository<PeticionEntity, Integer>{

}
