package org.launchcode.java.restaurant;

import java.util.concurrent.TimeUnit;


public class Restaurant {


    public static void main(String[] args) {
        Menu breakfastMenu = new Menu("Breakfast");
        MenuItem mi1 = new MenuItem("Pancakes", 2.75, "Stack of 3 Homestyle Pancakes", "Main");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MenuItem mi2 = new MenuItem("Sausage", 1.50, "2 Sausage Links", "Side");

        breakfastMenu.addItemToMenu(mi1);
        breakfastMenu.addItemToMenu(mi2);


        Menu lunchMenu = new Menu("Lunch");
        MenuItem mi3 = new MenuItem("Grilled Cheese Sandwich", 1.75, "Grilled Cheese on White Bread", "Main");
        lunchMenu.addItemToMenu(mi3);

        MenuItem mi4 = mi1;

        MenuItem mi5 = new MenuItem("Scrambled Eggs", 0.75, "2 Eggs - Scrambled", "Side");
        breakfastMenu.addItemToMenu(mi5);

        System.out.println(mi1);
        System.out.println(mi2);

        System.out.println("-----------------------");
        System.out.println(breakfastMenu);
        System.out.println(lunchMenu);
        breakfastMenu.removeItemFromMenu(mi2);
        System.out.println(breakfastMenu);

        System.out.println(mi1.equals(mi4));

        System.out.println(breakfastMenu.getAverageItemPrice());
    }
}