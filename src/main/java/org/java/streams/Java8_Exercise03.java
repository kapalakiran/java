package org.java.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8_Exercise03 {

    // Functional Interface - It has only one Abstract method

    public static void main(String[] args) {
        List<Integer> ints = List.of(4, 1, 3, 8, 12);

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        Predicate<Integer> integerPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return  integer % 2 == 0;
            }
        };
        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        // One Input & one output
        Function<Integer, Integer> integerIntegerFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer* integer;
            }
        };

        Consumer<Integer> println = System.out::println;

        Consumer<Integer> println2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
               System.out.println(integer);
            }
        };

//        ints.stream().
//                filter(integerPredicate2).
//                map(integerIntegerFunction2).
//                forEach(println2);
        System.out.println(addNumbersofList(List.of(8,12)));
        //intFunctionalInterface(List.of(12,22));
    }

    private static void intFunctionalInterface(List<Integer> integers) {
        integers.stream().reduce(0,Integer::sum);
    }

    private static int addNumbersofList(List<Integer> integers) {
        // reduction parallelize gracefully - effective use of multi-core
         //return integers.stream().reduce(0,Integer::sum); // method reference
        //return integers.stream().reduce(0, (x,y) -> x+y);
        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>(){

            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };

        return integers.stream().
                reduce(0, sum2); // will return  0
    }


}
