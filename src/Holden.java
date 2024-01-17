public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine() {
        String message = "Holden is starting the engine";
        System.out.println(getClass().getSimpleName());
        return message;
    }


    public String accelerate() {
        String message = "Holden is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }


    public String brake() {
        String message = "Holden is braking";
        System.out.println(getClass().getSimpleName() + ": " + message);
        return message;
    }
}
