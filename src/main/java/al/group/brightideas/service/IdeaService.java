package main.java.al.group.brightideas.service;

import java.util.Set;

import main.java.al.group.brightideas.model.Idea;
import main.java.al.group.brightideas.model.Like;

public interface IdeaService {
	
Like findByName(String name);
	
	Set<Idea> findAll();

}
