package org.launchcode.java.studios;

public class Area {
    public static void main(String[] args) {
        double radius_num;
        double area_num;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter the Radius of the Circle: ");
        radius_num = in.nextDouble();

        area_num = 3.14 * radius_num * radius_num ;
        System.out.println("The area of a circle of radius " + radius_num + " is: " + area_num);
    }

}


