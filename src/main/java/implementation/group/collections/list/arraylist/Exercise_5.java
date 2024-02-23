package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

//. Write a Java program to update an array element by the given element.
public class Exercise_5 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        colors.set(2,"Pink");

        System.out.println(colors);
    }
}
