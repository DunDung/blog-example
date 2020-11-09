package blog_example.generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2);
        CarUtils.list(numbers);
    }

}
