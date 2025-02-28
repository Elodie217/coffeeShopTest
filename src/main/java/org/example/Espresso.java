package org.example;

public class Espresso implements Coffee {

    public String prepare() {
        return "Préparation d'un Espresso";
    }

    public int cost() {
        return 5;
    }
}
