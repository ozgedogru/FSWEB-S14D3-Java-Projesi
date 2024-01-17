import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name ;
    private int wheels;

    public Car(int cylinders, String name) {
       this.engine = true;
       this.cylinders=cylinders;
       this.name=name;
       this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object car) {
        return name.equals(((Car)car).getName()) && cylinders == ((Car)car).getCylinders();
    }
    public String startEngine() {
        String message = "The car's engine is starting";
        System.out.println(getClass().getSimpleName());
        return message;
    }
    public String accelerate() {
        String message = "The car is accelerating";
        System.out.println(getClass().getSimpleName());
        return message;
    }

    public String brake() {
        String message = "The car is braking";
        System.out.println(getClass().getSimpleName());
        return message;
    }


    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
