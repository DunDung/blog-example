package blog_example.generics;

public class Car<T> {
    private final T name;

    public Car(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public static <T> Car<T> from(T name) {
        return new Car<>(name);
    }

    public <T> void printEqualsCar(Car<T> car) {
        System.out.println(this.equals(car));
    }

}
