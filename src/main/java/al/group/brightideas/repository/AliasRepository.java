package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.al.group.brightideas.model.Alias;
import main.java.al.group.brightideas.model.Like;

public interface AliasRepository extends JpaRepository<Like, Long>{
	
	Alias findByName(String name);
	
}
