package blog_example.generics;

import java.lang.reflect.Type;

public class Generics {
    public static void main(String[] args) throws NoSuchFieldException {
        Car<String> car = new Car<>("sport- car");
        Class<?> carNameType = car.getClass().getDeclaredField("name").getType();
        System.out.println(carNameType.getName());
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

