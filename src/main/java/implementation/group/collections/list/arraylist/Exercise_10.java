package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to shuffle elements in an array list.
public class Exercise_10 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("List before shuffle...");
        System.out.println(colors);

        Collections.shuffle(colors);

        System.out.println("List after shuffle...");
        System.out.println(colors);
    }
}
