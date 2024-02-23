package implementation.group.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write a Java program to sort a given array list.
public class Exercise_8 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        colors.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        colors.sort((s1,s2)-> s1.compareTo(s2));

        //using collections api
        Collections.sort(colors);

        System.out.println(colors);
    }
}
