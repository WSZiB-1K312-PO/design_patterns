package pl.edu.wszib.design_patterns.factory_method;

public class ElectricCar implements Car {
    @Override
    public void drive() {
        System.out.println("Move forward");
    }

    @Override
    public void reverse() {
        System.out.println("Move backward");
    }

    @Override
    public void start() {
        System.out.println("Power on");
    }

    @Override
    public void stop() {
        System.out.println("Power off");
    }
}
