package java.al.group.brightideas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.marjani.tvshows.model.Rating;
import al.marjani.tvshows.repository.RatingRepository;

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
