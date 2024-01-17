package RDCompany;

public class RDMain {
    public static void main(String[] args) {
        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Gas-powered car", 12.5, 4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric car", 300, 500);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "Hybrid car", 10.5, 400, 4);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        car.startEngine();
        car.drive();
        System.out.println("Type of the car: " + car.getClass().getSimpleName());
        System.out.println("************************");
    }
}
