package com.tomasba.micro.repository;

import org.springframework.data.repository.CrudRepository;

import com.tomasba.micro.domain.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}
