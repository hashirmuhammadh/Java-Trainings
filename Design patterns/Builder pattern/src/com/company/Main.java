package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Laptop laptop1 = new Laptop.LaptopBuilder("16 GB", "240 GB", "2.56 HZ").build();
        System.out.println("Laptop Config::"+laptop1);

        Laptop laptop2 = new Laptop.LaptopBuilder("32 GB", "1024 GB", "2.56 HZ").setBluetoothEnable(true).setGraphicsEnable(false).build();
        System.out.println("Laptop Config::"+laptop2);

        Laptop laptop3 = new Laptop.LaptopBuilder("32 GB", "240 GB", "2.56 HZ").setBluetoothEnable(true).build();

        System.out.println("Laptop Config::"+laptop3);
    }
}
