class Car{
    String brand;
    int speed;

    // default constructor
    Car(){
        brand = "Pagani";
        speed = 320;
    }

    void details() {System.out.println(brand + speed);}
}

public class Default{
    public static void main(String[] args) {
        Car car = new Car();
        car.details();
    }
}