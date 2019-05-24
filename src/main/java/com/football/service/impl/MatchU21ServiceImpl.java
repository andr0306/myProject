package com.football.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.entity.MatchU21Entity;
import com.football.repository.MatchU21Repository;
import com.football.service.MatchU21Service;

@Service
public class MatchU21ServiceImpl implements MatchU21Service{

	@Autowired
	private MatchU21Repository matchU21Repository;
	
	@Override
	public void saveMatchU21(MatchU21Entity matchU21entity) {
		
	matchU21Repository.save(matchU21entity);
		
	}

	@Override
	public List<MatchU21Entity> findAllMAtchesU21() {
		
		return matchU21Repository.findAll();
	}

	@Override
	public void deleteMatchU21ById(int id) {
		
		matchU21Repository.delete(id);
		
	}

	@Override
	public MatchU21Entity findMatchU21ById(int id) {
		// TODO Auto-generated method stub
		return matchU21Repository.findOne(id);
	}

}
