package com.rubchuk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubchuk.entity.NewsEntity;
import com.rubchuk.repository.NewsRepository;
import com.rubchuk.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsRepository newsRepository;
	
	
	@Override
	public void saveNews(NewsEntity newsEntity) {
		
	newsRepository.save(newsEntity)	;
		
	}

	@Override
	public List<NewsEntity> findAllNews() {
		// TODO Auto-generated method stub
		return newsRepository.findAll();
	}

	@Override
	public void deleteNewsById(int id) {
		
		newsRepository.delete(id);
		
	}

	@Override
	public NewsEntity findNewsById(int id) {
		// TODO Auto-generated method stub
		return newsRepository.findOne(id);
	}

}
