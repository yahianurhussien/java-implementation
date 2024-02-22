package implementation.group.collections.list;


//Write a Java program to create an array list,
// add some colors (strings) and print out the collection.


import java.util.ArrayList;
import java.util.List;

public class Exercise_1 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);
    }
}
