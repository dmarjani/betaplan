package main.java.al.group.brightideas.service;

import java.util.HashSet;
import java.util.Set;

import main.java.al.group.brightideas.model.Alias;
import main.java.al.group.brightideas.model.Like;

public interface LikeService {

	Like findByName(String name);
	
	Set<Like> findAll();
	
}
