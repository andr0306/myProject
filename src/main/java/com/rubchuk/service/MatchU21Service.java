package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.MatchEntity;
import com.rubchuk.entity.MatchU21Entity;

@Service
public interface MatchU21Service {


	void saveMatchU21 (MatchU21Entity matchU21entity);
	
	List<MatchU21Entity> findAllMAtches();
	
	void deleteMatchU21ById (int id);
	
	MatchU21Entity findMatchU21ById(int id);
}
