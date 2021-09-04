package java.al.group.brightideas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import al.marjani.tvshows.model.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

	@Query("SELECT r FROM Rating r WHERE r.show.id = ?1")
	List<Rating> findAllByShowId(Long showId);
	
}
