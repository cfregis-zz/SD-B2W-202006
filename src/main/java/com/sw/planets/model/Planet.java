package com.sw.planets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "planets")
public class Planet {

    @Id
    private String id;

    private String name;

    private String climate;

    private String terrain;

    private Integer amountFilms;

    public Planet() {
    }

    public Planet(String name, String climate, String terrain, Integer amountFilms) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
        this.amountFilms = amountFilms;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public Integer getAmountFilms() {
        return amountFilms;
    }

    public void setAmountFilms(Integer amountFilms) {
        this.amountFilms = amountFilms;
    }
}
