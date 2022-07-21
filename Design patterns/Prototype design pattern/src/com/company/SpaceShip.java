package com.company;

public class SpaceShip implements ProtoType {
    private String name;
    private Integer crew;
    private Double fuel;
    private Alien captain;

    public SpaceShip(String name, Integer crew, Double fuel, Alien captain) {
        this.name = name;
        this.crew = crew;
        this.fuel = fuel;
        this.captain = captain;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", crew=" + crew +
                ", fuel=" + fuel +
                ", captain=" + captain +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getCrew() {
        return crew;
    }

    public Double getFuel() {
        return fuel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrew(Integer crew) {
        this.crew = crew;
    }

    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    public void setCaptain(Alien captain) {
        this.captain = captain;
    }

    public Alien getCaptain() {
        return captain;
    }

    @Override
    public ProtoType createClone() {
        return new SpaceShip(name, crew, fuel, (Alien)captain.createClone());
    }
}
