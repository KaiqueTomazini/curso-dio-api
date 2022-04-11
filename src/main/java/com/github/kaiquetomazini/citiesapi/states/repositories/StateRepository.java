package com.github.kaiquetomazini.citiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.kaiquetomazini.citiesapi.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
