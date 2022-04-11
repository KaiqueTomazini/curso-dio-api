package com.github.kaiquetomazini.citiesapi.staties.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.kaiquetomazini.citiesapi.staties.repositories.StateRepository;
import com.github.kaiquetomazini.citiesapi.staties.entities.State;

@RestController 
@RequestMapping("/staties")
public class StateResource {

	private final StateRepository repository;

	public StateResource(final StateRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public List<State> staties() {
		return repository.findAll();
	}
	
}
