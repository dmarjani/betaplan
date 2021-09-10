package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.java.al.group.brightideas.model.Show;



public interface ShowRepository extends JpaRepository<Show, Long> {

	@Query("SELECT sh FROM Show sh WHERE sh.title = ?1 AND sh.network.name = ?2")
	Show getByTitleAndNetworkName(String title, String network);
	
	Show findByTitle(String title);
	
}
