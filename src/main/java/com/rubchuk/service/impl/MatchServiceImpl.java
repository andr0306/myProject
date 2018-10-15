package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.MatchEntity;
import com.rubchuk.repository.MatchRepository;
import com.rubchuk.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService{
	
	@Autowired
	private MatchRepository matchRepository;
	
	@Override
	public void saveMatch(MatchEntity matchEntity) {
		
		matchRepository.save(matchEntity);
		
	}

	@Override
	public List<MatchEntity> findAllMAtches() {
		
		return matchRepository.findAll();
	}

	@Override
	public void deleteMatchById(int id) {
		 matchRepository.delete(id);
		
	}

	@Override
	public MatchEntity findMatchById(int id) {
		
		return matchRepository.findOne(id);
	}

}
