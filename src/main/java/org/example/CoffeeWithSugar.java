package org.example;

public class CoffeeWithSugar {

    private Coffee baseCoffee;

    public CoffeeWithSugar(Coffee baseCoffee){
        this.baseCoffee = baseCoffee;
    }

    public String prepare(){
        return this.baseCoffee.prepare() + " avec du sucre";
    }

    public int cost(int price){
        return price + 2;
    }

}
