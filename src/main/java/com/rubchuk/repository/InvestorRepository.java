package com.rubchuk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rubchuk.entity.InvestorEntity;

@Repository
public interface InvestorRepository extends JpaRepository<InvestorEntity, Integer>{

}
