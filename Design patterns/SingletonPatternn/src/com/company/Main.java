package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton Inst1 = Singleton.getInstance();
        System.out.println(Inst1);

        Singleton Inst2 = Singleton.getInstance();
        System.out.println(Inst2);
    }
}
