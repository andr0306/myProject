package com.rubchuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubchuk.entity.MatchU21Entity;

@Repository
public interface MatchU21Repository extends JpaRepository<MatchU21Entity, Integer>{

}
