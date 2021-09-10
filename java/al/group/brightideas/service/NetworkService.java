package java.al.group.brightideas.service;

import al.marjani.tvshows.model.Network;

public interface NetworkService {

	Network save(Network network);
	
	Network getById(Long networkId);
	
	Network findByName(String name);
	
}
