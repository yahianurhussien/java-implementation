package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

///Write a Java program to insert an element into the array list at the first position.
public class Exercise_3 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        colors.add(0,"blue");

        System.out.println(colors);

    }
}
