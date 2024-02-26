package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to extract a portion of an array list.
public class Exercise_12 {

    public static void main(String[] args) {
       List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors.subList(0,2));
    }
}
