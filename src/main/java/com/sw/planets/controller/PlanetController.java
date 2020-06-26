package com.sw.planets.controller;

import com.sw.planets.model.Planet;
import com.sw.planets.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlanetController {

    @Autowired
    PlanetRepository planetRepository;

    @GetMapping("/planets")
    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    @GetMapping("/planets/{id}")
    public Planet getPlanetById(@PathVariable("id") String id) {
        return planetRepository.findById(id).get();

    }

    @GetMapping("/planet")
    public Planet getPlanetByName(@RequestParam(required = true) String name) {
        return planetRepository.findFirstByName(name);
    }

    @PostMapping("/planets")
    public Planet createPlanet(@RequestBody Planet planet) {
        return planetRepository.save(planet);
    }

    @PutMapping("/planets/{id}")
    public Planet updatePlanet(@PathVariable("id") String id, @RequestBody Planet planet) {
        return planetRepository.save(planet);
    }

    @DeleteMapping("/planets/{id}")
    public ResponseEntity<HttpStatus> deletePlanet(@PathVariable("id") String id) {
        planetRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}