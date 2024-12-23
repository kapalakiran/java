package org.java.streams;

import java.util.List;

public class JavaTest01 {

    public static void main(String[] args) {
  // System.out.println(dminimumfromTheList(List.of(100,555,12,344,1)));
      //  System.out.println(dmaximumfromTheList(List.of(1000,5551,122,344,1)));
        System.out.println(daddListStructured(List.of(100,555,12,344)));
//        System.out.println(addListStructuredWithLambdaExpressions(List.of(100,555,12,344)));
//        System.out.println(addListStructuredWithLambdaExpressionsAndIntegerClass(List.of(100,555,12,344)));
//        System.out.println(findSquareAndfindSumofSquareofAList(List.of(1,2,9)));
//        System.out.println(findcubeAndfindSumofCubeofAList(List.of(1,2,9)));
//        System.out.println(findSumOfOddNumbersinAList(List.of(7,9,8,2)));
//        System.out.println(sortedList(List.of(2,34,1)));
//        System.out.println(distinctList(List.of(2,34,1,1,2)));
//        System.out.println(distinctSortedList(List.of(2,34,1,1,2)));
//        System.out.println(sortListInReverseOrder(List.of(2,34,1,1,2)));
//        System.out.println(sortListInCustomOrder(List.of("BioR","Phy","SST","TY")));
//        System.out.println(createListWithDoubleValue(List.of(2,34,1,1,2)));
//        System.out.println(createListWithEvenNumbersFiltered(List.of(2,34,1,1,2)));
//        System.out.println(createListWithLengthOfAllCourse(List.of("BioR","Phy","SST","TY")));
    }

    private static int daddListStructured(List<Integer> integers) {
       return integers.stream().reduce(0,Integer::sum);
    }

    private static int dminimumfromTheList(List<Integer> integers) {
        return integers.stream().reduce(Integer.MAX_VALUE,(x,y) -> x<y ? x:y);
    }

    private static int dmaximumfromTheList(List<Integer> integers) {
        return integers.stream().reduce(Integer.MIN_VALUE,(x,y) -> x>y?x:y);
    }
}
