package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.TeamU21Entity;
import com.rubchuk.repository.TeamU21Repository;
import com.rubchuk.service.TeamU21Service;

@Service
public class TeamU21ServiceImpl implements TeamU21Service{

	@Autowired
	private TeamU21Repository teamU21Repository;
	@Override
	public void saveTeamU21(TeamU21Entity teamU21Entity) {
		teamU21Repository.save(teamU21Entity);
		
	}

	@Override
	public List<TeamU21Entity> findAllTeamU21() {
		// TODO Auto-generated method stub
		return teamU21Repository.findAll();
	}

	@Override
	public void deleteTeamU21ById(int id) {
		teamU21Repository.delete(id);
		
	}

	@Override
	public TeamU21Entity findTeamU21ById(int id) {
		// TODO Auto-generated method stub
		return teamU21Repository.findOne(id);
	}

	
}
