package RDCompany;

public class HybridCar extends CarSkeleton{
    double avgKmPerLitre;
    int batterySize;
    double cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, double cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting hybrid engine for " + name);    }
}
