package pl.edu.wszib.design_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        runCar(carFactory.createCar("ELECTRIC"));
        System.out.println();
        runCar(carFactory.createCar("DIESEL"));
    }

    private static void runCar(Car car) {
        car.start();
        car.drive();
        car.reverse();
        car.stop();
    }
}
