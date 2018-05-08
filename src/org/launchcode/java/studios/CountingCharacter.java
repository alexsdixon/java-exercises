package org.launchcode.java.studios;


import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class CountingCharacter {
    public static void main(String[] args) {

        String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        int len = paragraph.length();
        Map<Character, Integer> letter_count = new HashMap<Character, Integer>(Math.min(len, 26));

        for (int i = 0; i < len; ++i){

            char letter =  paragraph.charAt(i);

            if (!letter_count.containsKey(letter)){
                letter_count.put(letter, 1);
            }
            else{
                letter_count.put(letter, letter_count.get(letter) + 1);
            }
        }

        System.out.println(letter_count);


    }
}
