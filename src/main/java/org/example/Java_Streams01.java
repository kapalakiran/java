package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Java_Streams01 {

    public static void main(String[] args) {

       // getList(List.of("ff","fsfs"));
       // storeList(List.of("ki","kksf"));
        getIntList(List.of(2,45,5));
    }

    private static void getIntList(List<Integer> integers) {
        // to get only even numbers from the list of string
        List<Integer> sfsf = integers.stream().filter(integer -> integer % 2 == 0).toList();
        sfsf.forEach(System.out::println);

    }

    private static  void print(String s){
        System.out.println(s);
    }
    private static void getList(List<String> ff) {

        ff.stream().forEach(Java_Streams01 :: print); // Method Reference
        ff.stream().forEach(System.out::println); // Without creating method
    }

    private static void storeList(List<String> ff) {
        List<String> fsfs = ff.stream().toList();
        System.out.println(fsfs);
    }
}
