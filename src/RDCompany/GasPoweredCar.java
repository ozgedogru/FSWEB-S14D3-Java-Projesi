package RDCompany;

public class GasPoweredCar extends CarSkeleton {
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting gas engine for " + name);
    }
}
