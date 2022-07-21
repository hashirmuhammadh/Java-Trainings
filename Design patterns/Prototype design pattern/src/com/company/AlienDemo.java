package com.company;

public class AlienDemo {
    public static void main(String[] args) {
        Alien hash = new Alien("Hashir", 1.92d, 115.0d);
        Alien clone1 = (Alien)hash.createClone();
        Alien clone2 = (Alien)hash.createClone();
        Alien clone3 = (Alien)hash.createClone();
        Alien clone4 = (Alien)hash.createClone();

        clone1.setName("Hashir1");
        clone2.setName("Hashir2");
        clone3.setName("Hashir3");
        clone4.setName("Hashir4");

        System.out.println(hash);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
    }
}
