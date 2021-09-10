package main.java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.java.al.group.brightideas.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String name);
	
}
