class Car {
    String brand;
    int speed;

    // Parameterized Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println(brand + " speed: " + speed + " km/h");
    }
}

public class Parameterized_Construct {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 220);
        Car car2 = new Car("Audi", 240);

        car1.showDetails();
        car2.showDetails();
    }
}
