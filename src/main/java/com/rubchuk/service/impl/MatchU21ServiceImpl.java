package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.MatchEntity;
import com.rubchuk.entity.MatchU21Entity;
import com.rubchuk.repository.MatchRepository;
import com.rubchuk.repository.MatchU21Repository;
import com.rubchuk.service.MatchU21Service;

@Service
public class MatchU21ServiceImpl implements MatchU21Service{

	private MatchU21Repository matchU21Repository;
	
	@Override
	public void saveMatchU21(MatchU21Entity matchU21entity) {
		
	matchU21Repository.save(matchU21entity);
		
	}

	@Override
	public List<MatchU21Entity> findAllMAtches() {
		
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
