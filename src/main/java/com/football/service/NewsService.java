package com.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.football.entity.NewsEntity;

@Service
public interface NewsService {

		void saveNews (NewsEntity newsEntity);
		
		List<NewsEntity> findAllNews();
		
		void deleteNewsById (int id);
		
		NewsEntity findNewsById (int id);
}
