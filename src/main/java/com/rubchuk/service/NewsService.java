package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.NewsEntity;

@Service
public interface NewsService {

		void saveNews (NewsEntity newsEntity);
		
		List<NewsEntity> findAllNews();
		
		void deleteNewsById (int id);
		
		NewsEntity findNewsById (int id);
}
