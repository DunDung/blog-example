package blog_example.generics;

public class Main {
    public static void main(String[] args) {
        Car<String> car1 = new Car<>("1");
        Car<Integer> car2 = new Car<>(2);
//        car1.printEqualsCar(car2);
        Car.from("앙");
    }

}
