package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.al.group.brightideas.model.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{
	
	Like findByName(String name);
	
}
