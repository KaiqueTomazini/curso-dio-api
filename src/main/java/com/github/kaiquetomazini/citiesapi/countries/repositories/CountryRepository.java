package com.github.kaiquetomazini.citiesapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.kaiquetomazini.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
	
	
	
}
