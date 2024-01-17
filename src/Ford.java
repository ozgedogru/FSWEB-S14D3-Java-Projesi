public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    public String startEngine() {
        String message = "Ford is starting the engine";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    public String accelerate() {
        String message = "Ford is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    public String brake() {
        String message = "Ford is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }
}
