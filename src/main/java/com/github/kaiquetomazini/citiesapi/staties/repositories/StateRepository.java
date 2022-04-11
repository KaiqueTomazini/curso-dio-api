package com.github.kaiquetomazini.citiesapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.kaiquetomazini.citiesapi.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
