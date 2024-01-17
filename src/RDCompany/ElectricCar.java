package RDCompany;

public class ElectricCar extends CarSkeleton {
     double avgKmPerCharge;
     int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    public void startEngine() {
        System.out.println("Starting electric engine for " + name);
    }
}
