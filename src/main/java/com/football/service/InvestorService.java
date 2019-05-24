package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.InvestorEntity;

@Service
public interface InvestorService {

	void saveInvestor(InvestorEntity investorEntity);
	
	List<InvestorEntity> findAllInvestors();
	
	InvestorEntity findInvestorById(int id);
	
	void deleteInvestor(int id);
}
