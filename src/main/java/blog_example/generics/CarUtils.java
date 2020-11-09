package blog_example.generics;

import java.util.List;

public class CarUtils {

    public static <T extends Number> void list(List<T> objects) {
        objects.toArray();
    }

}
