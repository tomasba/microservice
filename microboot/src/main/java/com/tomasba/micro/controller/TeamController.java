package com.tomasba.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomasba.micro.domain.Team;
import com.tomasba.micro.repository.TeamRepository;

//commented-out as the mapping work done in crud repositories annotated with @RestResource
//@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public Iterable<Team> getTeams() { 
		return teamRepository.findAll();
	}
	
	@RequestMapping("/team/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamRepository.findOne(id);
	}

}
