package org.example;

public class Latte implements Coffee {

    public String prepare() {
        return "Préparation d'un Café au lait";
    }

    public int cost() {
        return 5;
    }
}
