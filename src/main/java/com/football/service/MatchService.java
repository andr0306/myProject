package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.MatchEntity;

@Service
public interface MatchService {

	
	
	void saveMatch (MatchEntity matchentity);
	
	List<MatchEntity> findAllMAtches();
	
	void deleteMatchById (int id);
	
	MatchEntity findMatchById(int id);
}
