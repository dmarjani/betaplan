package java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import al.marjani.tvshows.model.Network;

public interface NetworkRepository extends JpaRepository<Network, Long>{

	Network findByName(String name);
	
}
