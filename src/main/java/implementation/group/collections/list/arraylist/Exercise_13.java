package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to compare two array lists.
public class Exercise_13 {

    public static void main(String[] args) {
        List<String> c1 = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        List<String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Green");
        colors2.add("Orange");
        colors2.add("White");
        colors2.add("Black");

        //using containsAll
        System.out.println(colors.containsAll(colors2));

        for(String s: colors2){
            c1.add(colors.contains(s) ? "true" : "false");
        }

        System.out.println(c1);
    }
}
