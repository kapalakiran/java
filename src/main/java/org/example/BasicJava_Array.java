package org.example;

public class BasicJava_Array {

    public static void main(String[] args){
        int[] numbers2 = null;
        int[] numbers = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        for (int i = 0; i < numbers.length; i++)
            System.out.println("Element at index " + i + " : "+ numbers[i]);

        System.out.println("Size of numbers  : "+ numbers.length);

        String s = "{fsfs:fsFSF}";
        String gs = s.replace("fsfs","kk");
        System.out.println("-------");
        System.out.println(gs);

    }
}
