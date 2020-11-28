package blog_example.javablecomment;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Example {
    private static final String DEFAULT_NAME = "김철수";

    public static void main(String[] args) {
        List<String> names = Arrays.asList("123", null, "12");
        System.out.println(countNull(names));
    }

    public static long countNull(List<String> names) {
        asd(Arrays.asList(1, 3, 2));
        return names.stream()
                .filter(Objects::isNull)
                .count();
    }

    public static <T> void asd(List<T> list) {

    }
}
