package main.java.al.group.brightideas.service;

import main.java.al.group.brightideas.model.Network;

public interface NetworkService {

	Network save(Network network);
	
	Network getById(Long networkId);
	
	Network findByName(String name);
	
}
