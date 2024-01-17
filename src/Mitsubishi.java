public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine() {
        String message = "Mitsubishi is starting the engine";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    public String accelerate() {
        String message = "Mitsubishi is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }


    public String brake() {
        String message = "Mitsubishi is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }
}
