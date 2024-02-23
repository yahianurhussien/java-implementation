package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to search for an element in an array list.
public class Exercise_7 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

         //using built in methods
        if(colors.contains("Whit")){
            System.out.println("found...");
        }else {
            System.out.println("Not found...");
        }
        //using for loop
        for(String s: colors){
            if (s.equals("White")){
                System.out.println("found");
            }
        }

    }
}
