package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.PeticionEntity;

@Service
public interface PeticionService {
	
	void savePeticion (PeticionEntity peticionEntity);

	List<PeticionEntity> findAllPeticion();
	
	void deletePeticionById( int id);
	
	PeticionEntity findPeticionById(int id);

}
