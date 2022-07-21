package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Restaurant beefResto = new BeefBurgerRestaurant();
        beefResto.orderBurger();

        System.out.println("=====================================");

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        veggieResto.orderBurger();
    }
}
