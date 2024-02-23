package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Exercise_4 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");


        String first_element = colors.getFirst();
        String third_element = colors.get(2);
        String last_element = colors.getLast();

        System.out.println("First element : "+first_element);
        System.out.println("Third element : "+third_element);
        System.out.println("Last element : "+last_element);
    }
}
