package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.TeamU21Entity;

@Service
public interface TeamU21Service {

	void saveTeamU21(TeamU21Entity teamU21Entity);
	
	List<TeamU21Entity> findAllTeamU21();
	
	void deleteTeamU21ById (int id);
	
	TeamU21Entity findTeamU21ById (int id);
}
