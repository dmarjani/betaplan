package main.java.al.group.brightideas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.al.group.brightideas.model.Show;
import main.java.al.group.brightideas.repository.ShowRepository;


@Service
public class ShowServiceImpl implements ShowService {

	@Autowired
	private ShowRepository showRepo;
	
	@Override
	public Show save(Show show) {
		return this.showRepo.save(show);
	}

	@Override
	public void delete(Show show) {
		this.showRepo.delete(show);
	}

	@Override
	public List<Show> findAll() {
		return this.showRepo.findAll();
	}

	@Override
	public Show getByTitleAndNetworkName(String title, String network) {
		return this.showRepo.getByTitleAndNetworkName(title, network);
	}

	@Override
	public Show getById(Long showId) {
		return this.showRepo.getOne(showId);
	}

	@Override
	public Show findByTitle(String title) {
		return this.showRepo.findByTitle(title);
	}

}
