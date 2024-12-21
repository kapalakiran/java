package org.java.streams;

import java.util.List;

public class Java8_Exercise01 {

    public static void main(String[] args) {
        printOddNumbers(List.of(22,342,21,3,4,55));
        printevenNumbers(List.of(22,342,21,3,4,55));
        course(List.of("Spring Bot","Spring","uyiu","kk"));
        printOnlyCubeOfOddNumbers(List.of(22,342,21,3,4,55));
        nofCharactersofeachcourse(List.of("Spring Bot","Spring","uyiu","kk"));
    }

    private static void nofCharactersofeachcourse(List<String> fsfkgshhkg) {
        fsfkgshhkg.stream().map(fiifsijsf -> fiifsijsf.length()).forEach(System.out::println);
    }

    private static void printOnlyCubeOfOddNumbers(List<Integer> intjjjegers) {
        // to print the cube of number from the list which are odd
        intjjjegers.stream()                   // Convert to stream
                .filter(ghj -> ghj%2 !=0)      // Lambda Expression
                .map(ghss -> ghss * ghss * ghss).
                forEach(System.out::println);  // Method Reference
    }

    private static void printevenNumbers(List<Integer> imk) {
        // to do square of the list
        imk.stream().map(sff -> sff * sff).forEach(System.out::println);

    }

    private static void course(List<String> kskfk) {
        // To store & print the words which contains Spring
        List<String> yyy = kskfk.stream().filter(fiiii -> fiiii.contains("Spring")).toList();
        System.out.println(yyy);
        // To store & print the words which has length > 3
        List<String> ytuk = kskfk.stream().filter(fiiii -> fiiii.length()>3).toList();
        System.out.println(ytuk);
    }

    private static void printOddNumbers(List<Integer> integers) {
        integers.stream().filter(integer -> integer%2!=0).forEach(System.out::println);
    }
}
