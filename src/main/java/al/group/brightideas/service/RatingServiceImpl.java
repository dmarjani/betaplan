package main.java.al.group.brightideas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.al.group.brightideas.model.Rating;
import main.java.al.group.brightideas.repository.RatingRepository;


@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepo;
	
	@Override
	public List<Rating> findAll() {
		return this.ratingRepo.findAll();
	}

	@Override
	public List<Rating> findAllByShowId(Long showId) {
		return this.ratingRepo.findAllByShowId(showId);
	}

	@Override
	public Rating save(Rating rating) {
		return this.ratingRepo.save(rating);
	}

	@Override
	public void delete(Rating rating) {
		this.ratingRepo.delete(rating);
	}

}
