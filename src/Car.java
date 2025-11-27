public class Car {
    private String name;
    private int speed;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
