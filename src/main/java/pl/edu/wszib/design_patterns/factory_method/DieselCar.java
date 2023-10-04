package pl.edu.wszib.design_patterns.factory_method;

public class DieselCar implements Car {
    @Override
    public void drive() {
        System.out.println("Put first gear");
        System.out.println("Move forward");
        System.out.println("Put second gear");
        System.out.println("Move forward");
        System.out.println("Put third gear");
        System.out.println("Move forward");
        System.out.println("Put fourth gear");
        System.out.println("Move forward");
        System.out.println("Put fifth gear");
        System.out.println("Move forward");
    }

    @Override
    public void reverse() {
        System.out.println("Put reverse gear");
        System.out.println("Move backward");
    }

    @Override
    public void start() {
        System.out.println("Put neutral gear");
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }
}
