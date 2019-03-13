package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.PeticionEntity;
import com.rubchuk.repository.PeticionRepository;
import com.rubchuk.service.PeticionService;
@Service
public class PeticionServiceImpl implements PeticionService{
	
	@Autowired
	private PeticionRepository peticionRepository;
	
	@Override
	public void savePeticion(PeticionEntity peticionEntity) {
		
		peticionRepository.save(peticionEntity);
	}

	@Override
	public List<PeticionEntity> findAllPeticion() {
		
		return peticionRepository.findAll();
		
	}

	@Override
	public void deletePeticionById(int id) {
		
		peticionRepository.delete(id);
		
	}

	@Override
	public PeticionEntity findPeticionById(int id) {
		
		return peticionRepository.findOne(id);
	}

}
