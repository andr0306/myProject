package com.football.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.entity.TeamEntity;
import com.football.repository.TeamRepository;
import com.football.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public void saveTeam(TeamEntity teamEntity) {
		 
		teamRepository.save(teamEntity);
	}

	@Override
	public List<TeamEntity> findAllTeam() {
		
		return teamRepository.findAll();
	}

	@Override
	public void deleteTeamById(int id) {
		
		teamRepository.delete(id);
		
	}

	@Override
	public TeamEntity findTeamById(int id) {
		
		return teamRepository.findOne(id);
	}

}
