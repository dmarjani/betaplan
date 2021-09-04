package java.al.group.brightideas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import al.marjani.tvshows.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Role findByName(String name);
	
}
