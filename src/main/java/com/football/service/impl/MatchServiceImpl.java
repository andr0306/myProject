package com.football.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.entity.MatchEntity;
import com.football.repository.MatchRepository;
import com.football.service.MatchService;

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
