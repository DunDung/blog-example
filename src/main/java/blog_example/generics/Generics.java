package blog_example.generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        MyOptional<String> stringOptional = new MyOptional<>("hello");
        List<String> list = new ArrayList<>();

        System.out.println(stringOptional.getTypeName());

    }

}

class MyOptional<T> {
    T t;

    public MyOptional(T t) {
        this.t = t;
    }

    public static <T extends CharSequence> MyOptional<T> ofNullable(T t) {
        return new MyOptional<>(t);
    }

    public T get() {
        return this.t;
    }

    public Type getTypeName() {
        try {
            return this.getClass().getDeclaredField("t").getType();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}

