package RDCompany;

public class CarSkeleton {
     String name;
     String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine() {
        System.out.println("engine started for" + name);
    }
    public void drive() {
        runEngine();
        System.out.println("driving " + name);
    }
    protected void runEngine() {
        System.out.println("running engine for " + name);
    }
}
