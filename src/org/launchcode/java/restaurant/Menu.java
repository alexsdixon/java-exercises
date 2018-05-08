package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private String name;
    public ArrayList<MenuItem> menuItems = new ArrayList<>();
    public Date created = new Date();
    public Date lastUpdate = new Date();

    public Menu(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void addItemToMenu(MenuItem item) {
        this.menuItems.add(item);
        this.setLastUpdate(new Date());
    }

    public void removeItemFromMenu(MenuItem item) {
        for (MenuItem i : this.getMenuItems()) {
            if (i.equals(item)) {
                this.menuItems.remove(item);
                this.setLastUpdate(new Date());
            }
        }
    }

    public double getAverageItemPrice() {
        double sum = 0.0;
        int count = getMenuItems().size();
        for (MenuItem item : getMenuItems()) {
            sum += item.getPrice();
        }
        return sum / count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (!name.equals(menu.name)) return false;
        return created.equals(menu.created);
    }

    @Override
    public String toString() {

        String text = "Menu Name: " + name + "\n" +
                "Created: " + created + "\n" +
                "Last Updated: " + lastUpdate + "\n" +
                "Menu Items:\n";
        for (MenuItem item : this.getMenuItems()) {
            text += "\tName: " + item.getName() + "\n" +
                    "\tPrice: $" + item.getPrice() + "\n" +
                    "\tDescription: " + item.getDescription() + "\n" +
                    "\tCreated: " + item.getCreated() + "\n\n";
        }
        return text;
    }

}