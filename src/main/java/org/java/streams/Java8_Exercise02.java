package org.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Exercise02 {

    /**
     * Operations on performed on stream & return the stream back are called Intermediate Operations
     * For E.g. Filter, Distinct, Sorted & Map -> return stream
     *
     * Operations on performed on stream & which doesn't stream are called Terminal Operations.
     * Terminal Operations return other than streams.
     * forEach -> void
     * collect -> specific type ( it can be set, map etc. )
     * reduce -> specific type
     *
     * We do Intermediate Operations & then we perform Terminal Operations
     *
     */
    public static void main(String[] args) {
        System.out.println(minimumfromTheList(List.of(100,555,12,344)));
        System.out.println(maximumfromTheList(List.of(100,555,12,344)));
        System.out.println(addListStructured(List.of(100,555,12,344)));
        System.out.println(addListStructuredWithLambdaExpressions(List.of(100,555,12,344)));
        System.out.println(addListStructuredWithLambdaExpressionsAndIntegerClass(List.of(100,555,12,344)));
        System.out.println(findSquareAndfindSumofSquareofAList(List.of(1,2,9)));
        System.out.println(findcubeAndfindSumofCubeofAList(List.of(1,2,9)));
        System.out.println(findSumOfOddNumbersinAList(List.of(7,9,8,2)));
        System.out.println(sortedList(List.of(2,34,1)));
        System.out.println(distinctList(List.of(2,34,1,1,2)));
        System.out.println(distinctSortedList(List.of(2,34,1,1,2)));
        System.out.println(sortListInReverseOrder(List.of(2,34,1,1,2)));
        System.out.println(sortListInCustomOrder(List.of("BioR","Phy","SST","TY")));
        System.out.println(createListWithDoubleValue(List.of(2,34,1,1,2)));
        System.out.println(createListWithEvenNumbersFiltered(List.of(2,34,1,1,2)));
        System.out.println(createListWithLengthOfAllCourse(List.of("BioR","Phy","SST","TY")));

    }

    private static  List<Integer> createListWithLengthOfAllCourse(List<String> bioR) {
          //bioR.stream().map(x-> x.length()).toList();
        return  bioR.stream().map(String::length).toList();
    }

    private static List<Integer> createListWithEvenNumbersFiltered(List<Integer> integers) {
        return  integers.stream().filter(x -> x%2==0).toList();
    }

    private static List<Integer> createListWithDoubleValue(List<Integer> integers) {
        return  integers.stream().map(x -> x*x).collect(Collectors.toList());
    }

    private static List<String> sortListInCustomOrder(List<String> bio) {
        return  bio.stream().sorted(Comparator.comparing(ytyy -> ytyy.length())).toList();
    }

    private static List<Integer> sortListInReverseOrder(List<Integer> integers) {
        return  integers.stream().sorted(Comparator.reverseOrder()).toList();
    }

    private static List<Integer> distinctSortedList(List<Integer> integers) {
        return  integers.stream().distinct().sorted().toList();
    }

    private static List<Integer> distinctList(List<Integer> integers) {
        return  integers.stream().distinct().toList();
    }

    private static List<Integer> sortedList(List<Integer> integers) {
        return  integers.stream().sorted().toList();
    }

    private static int findSumOfOddNumbersinAList(List<Integer> integers) {
        //integers.stream().filter(x -> x%2 ==1).reduce(0,Integer::sum);
        return integers.stream().reduce(0,(x,y) -> y%2!=0?x+y:x);
    }

    private static int findcubeAndfindSumofCubeofAList(List<Integer> integers) {
        return integers.stream().reduce(0, (x, y) -> Integer.sum(x, y * y * y ));
    }

    private static int findSquareAndfindSumofSquareofAList(List<Integer> integers) {
               //integers.stream().map(x -> x * x ).reduce(0, Integer::sum);
        return integers.stream().reduce(0, (x, y) -> Integer.sum(x, y * y ));
    }


    private static int maximumfromTheList(List<Integer> integers) {
       return integers.stream().reduce(Integer.MIN_VALUE, (x,y) -> x>y?x:y);
    }

    private static int minimumfromTheList(List<Integer> integers) {
        return integers.stream().reduce(Integer.MAX_VALUE, (x,y) -> x<y?x:y);
    }

    private static int addListStructuredWithLambdaExpressionsAndIntegerClass(List<Integer> integers) {
        return integers.stream().reduce(0,Integer::sum);
    }

    private static int addListStructuredWithLambdaExpressions(List<Integer> integers) {
        return  integers.stream().reduce(0,(x,y) -> x+y);
    }

    private static int sum(int agergate,int nextnumber){
        return agergate+nextnumber;
    }

    /**Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function,
     *  and returns the reduced value. This is equivalent to:
     T result = identity;  for (T element : this stream)      result = accumulator.apply(result, element)  return result;
     but is not constrained to execute sequentially.
     **/
    private static int addListStructured(List<Integer> integers) {
        return integers.stream()
                .reduce(0,Java8_Exercise02::sum); // 0 -> initial value
    }
}
