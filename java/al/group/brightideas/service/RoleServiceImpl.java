package java.al.group.brightideas.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import al.marjani.tvshows.model.Role;
import al.marjani.tvshows.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepo;
	
	@Override
	public Role findByName(String name) {
		return this.roleRepo.findByName(name);
	}
	
	@Override
	public Set<Role> findAll() {
		return new HashSet<Role>(this.roleRepo.findAll());
	}

}
