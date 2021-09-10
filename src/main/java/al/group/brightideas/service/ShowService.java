package main.java.al.group.brightideas.service;

import java.util.List;

import main.java.al.group.brightideas.model.Show;


public interface ShowService {

	Show save(Show show);
	
	void delete(Show show);
	
	List<Show> findAll();
	
	Show getByTitleAndNetworkName(String title, String network);
	
	Show getById(Long showId);
	
	Show findByTitle(String title);
 	
}
