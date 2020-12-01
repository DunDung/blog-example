package blog_example.generics;

import java.lang.reflect.Type;

public class Generics {
    public static void main(String[] args) {
        MyOptional myOptional = new MyOptional("hello");
        System.out.println(myOptional.getTypeName());

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
        System.out.println(t.getClass().getName());
        try {
            return this.getClass().getDeclaredField("t").getType();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}

