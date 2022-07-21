package com.company;

public class Alien implements ProtoType {
    private String name;
    private Double height;
    private Double weight;


    public Alien(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public ProtoType createClone() {
        return new Alien(name, height, weight);
    }
}
