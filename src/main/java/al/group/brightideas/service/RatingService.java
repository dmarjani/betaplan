package main.java.al.group.brightideas.service;

import java.util.List;

import main.java.al.group.brightideas.model.Rating;



public interface RatingService {

	List<Rating> findAll();
	
	List<Rating> findAllByShowId(Long showId);
	
	Rating save(Rating rating);

	void delete(Rating rating);
	
}
