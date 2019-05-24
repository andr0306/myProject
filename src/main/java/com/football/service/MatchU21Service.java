package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.MatchU21Entity;

@Service
public interface MatchU21Service {


	void saveMatchU21 (MatchU21Entity matchU21entity);
	
	List<MatchU21Entity> findAllMAtchesU21();
	
	void deleteMatchU21ById (int id);
	
	MatchU21Entity findMatchU21ById(int id);
}
