package pl.edu.wszib.design_patterns.factory_method;

public class CarFactory {
    public Car createCar(String fuelType) {
        return switch (fuelType) {
            case "ELECTRIC" -> new ElectricCar();
            case "DIESEL" -> new DieselCar();
            default -> new DieselCar();
        };
    }
}
