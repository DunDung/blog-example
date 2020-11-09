package blog_example.generics;

public class Car<T> {
    private final T name;

    public Car(T name, Number speed) {
        this.name = name;
    }

}
