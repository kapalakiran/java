package org.java.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java_BehaviorParameterization {

    // BehaviorParameterization - Passing the logic of the method as argument of the method,
    // or passing the behaviour of the method as an argument
    // We can pass methods to another method, we can store method into a variable,
    // We can return a method from another method
    public static void main(String[] args) {
        System.out.println("Even Numbers");
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        filterAndPrint(List.of(1,2,5,4),integerPredicate);
        System.out.println("Odd Numbers");
        filterAndPrint(List.of(1,2,5,4),x -> x % 2 != 0);
        System.out.println("Square of Numbers");
      System.out.println(squareofNum(List.of(2,5), x -> x * x));
    }

    private static List<Integer> squareofNum(List<Integer> i, Function<Integer, Integer> integerIntegerFunction) {
    return    i.stream().map(integerIntegerFunction).collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> integers,Predicate<Integer> predicate) {
        integers.stream().filter(predicate).forEach(System.out::println);
    }
}
