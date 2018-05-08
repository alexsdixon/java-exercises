package org.launchcode.java.restaurant;

import java.math.BigDecimal;
import java.util.Date;


public class MenuItem {

    // Each menu item has a price, description, and category (appetizer, main course, or dessert)
    private String name;
    private double price;
    private String description;
    private String category;
    private Date created = new Date();

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = roundTwo(price);
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreated() {

        return created;
    }

    public boolean isNewItem() {
        long diff =  new Date().getTime() - this.created.getTime();
        System.out.println(diff);
        if (diff < 10000) {
            return true;
        }
        return false;
    }

    private static double roundTwo(double input) {
        return new BigDecimal(input).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
    }

    public boolean equals(Object o) {
        // self check
        if (this == o)
            return true;

        // null check
        if (o == null)
            return false;

        // type check and cast
        if (getClass() != o.getClass())
            return false;

        MenuItem item = (MenuItem) o;

        // field comparison
        return name.equals(item.getName())
                && getPrice() == item.getPrice()
                && getDescription() == item.getDescription()
                && getCategory() == item.getCategory();
    }

    @Override
    public String toString() {
        return "Menu Item " + name + "\n" +
                "\tPrice: $" + price + "\n" +
                "\tDescription: " + description + "\n" +
                "\tCategory: " + category + "\n" +
                "\tCreated: " + created + "\n\n";
    }
}