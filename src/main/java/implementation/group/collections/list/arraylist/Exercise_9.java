package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Write a Java program to copy one array list into another.
public class Exercise_9 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");


        System.out.println("Colors before merge....");
        System.out.println(colors);

        List<String> colorList = new ArrayList<>();
        colorList.add("Pink");
        colorList.add("Brown");

        System.out.println("ColorList before merge....");
        System.out.println(colorList);

        colors.addAll(colorList);

        System.out.println("Colors after merge....");
        System.out.println(colors);


        Collections.copy(colors,colorList);
        System.out.println("Colors after copy using Collections copy method....");
        System.out.println(colors);
    }
}
