package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SpaceShip round = new SpaceShip("Round", 100, 14.4d, new Alien("Mike", 192d, 100.0d));
        System.out.println(round);

        SpaceShip clone1 = (SpaceShip)round.createClone();
        clone1.setName("Cube");
        clone1.getCaptain().setName("a new name");
        SpaceShip clone2 = (SpaceShip)clone1.createClone();
        SpaceShip clone3 = (SpaceShip)round.createClone();
        clone2.setCrew(200);
        clone3.setName("WeirdShape");
        clone3.getCaptain().setName("Yet another name... 3");

        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
    }
}
