package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from an array list.
public class Exercise_6 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");


        System.out.println(colors);

        colors.remove(2);

        System.out.println(colors);
    }
}
