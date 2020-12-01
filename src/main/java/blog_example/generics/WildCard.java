package blog_example.generics;

import java.util.Arrays;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("가", "나", "다");
        printList2(numbers);    // 컴파일 에러
        List<Integer> num1 = Arrays.asList(1);
        List<Integer> num2 = Arrays.asList(1);
        List<Double> num3 = Arrays.asList(1.0);
    }

    public static void printList(List<Object> list) {
        list.forEach(System.out::println);
    }

    public static void printList2(List<? extends CharSequence> list) {
        list.forEach(System.out::println);
    }

    public static void sum(List<? super Integer> list) {
    }

    public static <E extends CharSequence> void printList3(List<E> list) {
        list.forEach(System.out::println);
    }

    public static <E extends Number> void copy(List<E> list1, List<E> list2) {

    }
}
