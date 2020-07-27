package com.company;

public class Food {

    // Members / values to class
    public int id;
    public String name;
    public double price_regular;
    public double price_family;
    public double price_giant;

    // Methods
    public Food(int id, String name, double price_regular, double price_family, double price_giant) {
        this.id = id;
        this.name = name;
        this.price_regular = price_regular;
        this.price_family = price_family;
        this.price_giant = price_giant;
    }

    public Food(){}
}
