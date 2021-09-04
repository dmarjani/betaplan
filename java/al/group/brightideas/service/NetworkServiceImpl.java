package java.al.group.brightideas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.marjani.tvshows.model.Network;
import al.marjani.tvshows.repository.NetworkRepository;

@Service
public class NetworkServiceImpl implements NetworkService {

	@Autowired
	private NetworkRepository networkRepo;
	
	@Override
	public Network save(Network network) {
		return this.networkRepo.save(network);
	}

	@Override
	public Network getById(Long networkId) {
		return this.networkRepo.getOne(networkId);
	}

	@Override
	public Network findByName(String name) {
		return this.networkRepo.findByName(name);
	}

}
