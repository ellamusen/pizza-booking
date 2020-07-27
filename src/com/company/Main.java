package com.company;

public class Main {

    public static void main(String[] args) {

        // Set up foods - without constructor
        Food pita = new Food();
        pita.id = 1;
        pita.name = "Pita";
        pita.price_regular = 10;
        pita.price_family = 15;
        pita.price_giant = 16;
        // Set up foods - with constructor
        Food durum = new Food(2,"Durum",5,6,7);
        Food pizza = new Food(2,"Pizza",5,6,7);

    }
}
