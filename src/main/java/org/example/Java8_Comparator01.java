package org.example;

public class Java8_Comparator01 implements Comparable<Java8_Comparator01> {
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Java8_Comparator01 m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Java8_Comparator01(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
