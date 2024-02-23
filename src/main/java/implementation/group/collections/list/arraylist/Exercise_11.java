package implementation.group.collections.list.arraylist;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to reverse elements in an array list.
public class Exercise_11 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("List before reverse...");
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println("List after reverse...");
        System.out.println(colors);
    }
}
