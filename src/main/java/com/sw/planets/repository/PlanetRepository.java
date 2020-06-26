package com.sw.planets.repository;

import com.sw.planets.model.Planet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlanetRepository  extends MongoRepository<Planet, String> {

    Planet findFirstByName(String name);
}
