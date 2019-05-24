package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.TeamEntity;

@Service
public interface TeamService {
	
		void saveTeam (TeamEntity teamEntity);
		
		List<TeamEntity> findAllTeam();
		
		void deleteTeamById (int id);
		
		TeamEntity findTeamById (int id);
		
		
 
}
