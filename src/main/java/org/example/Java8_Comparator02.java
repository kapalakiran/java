package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Java8_Comparator02 {
    public static void main(String[] args)
    {
        ArrayList<Java8_Comparator01> list = new ArrayList<Java8_Comparator01>();
        list.add(new Java8_Comparator01("Star Wars", 8.7, 1977));
        list.add(new Java8_Comparator01("Empire Strikes Back", 8.8, 1981));
        list.add(new Java8_Comparator01("Return of the Jedi", 8.4, 1983));
        list.add(new Java8_Comparator01("Force Awakens 2", 8.5, 2024));
        list.add(new Java8_Comparator01("Empire Strikes Back 02", 8.8, 1980));
        list.add(new Java8_Comparator01("Force Awakens", 8.3, 2015));

        Collections.sort(list);
        System.out.println("Movies : "+list.toString());

        System.out.println("Movies after sorting : ");
        for (Java8_Comparator01 movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
