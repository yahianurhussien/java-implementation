package implementation.group.collections.list.arraylist;

//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise_2 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        //enhanced for loop
        System.out.println("using enhanced for loop");
        for( String s: colors){
            System.out.println(s);
        }

        // using iterator
        System.out.println();
        System.out.println("using iterator .....");
        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
