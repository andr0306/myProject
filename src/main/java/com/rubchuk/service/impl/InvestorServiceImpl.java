package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.InvestorEntity;
import com.rubchuk.repository.InvestorRepository;
import com.rubchuk.service.InvestorService;

@Service
public class InvestorServiceImpl implements InvestorService {

	@Autowired
	private InvestorRepository investorRepository;

	@Override
	public void saveInvestor(InvestorEntity investorEntity) {
		investorRepository.save(investorEntity);
		
	}

	@Override
	public List<InvestorEntity> findAllInvestors() {
		
		return investorRepository.findAll();
	}

	@Override
	public InvestorEntity findInvestorById(int id) {
		
		return investorRepository.findOne(id);
	}

	@Override
	public void deleteInvestor(int id) {
		investorRepository.delete(id);
		
	}
}
