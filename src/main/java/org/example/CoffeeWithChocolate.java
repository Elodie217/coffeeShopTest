package org.example;

public class CoffeeWithChocolate {

    private Coffee baseCoffee;

    public CoffeeWithChocolate(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    public String prepare(){
        return this.baseCoffee.prepare() + " avec du chocolat";
    }

    public int prepare(int price){
        return price + 2;
    }
}
