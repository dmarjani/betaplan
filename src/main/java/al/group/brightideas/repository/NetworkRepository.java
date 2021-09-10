package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.al.group.brightideas.model.Network;



public interface NetworkRepository extends JpaRepository<Network, Long>{

	Network findByName(String name);
	
}
