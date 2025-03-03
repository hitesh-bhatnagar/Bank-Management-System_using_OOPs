// Parameterized Constructor takes arguments to set values dynamically

class Car{
    String brand;
    int speed;
    int milage;

    Car(String brand, int speed, int par1){
        this.brand = brand;
        this.speed = speed;
    }
    Car(Car c, int milage){
            this.brand = c.brand;
            this.speed = c.speed;
            this.milage = milage;
    }
    void details(){
        System.out.println(brand + speed + milage);
    }
}
public class Copy_construct{
    public static void main(String args[]){
        Car car1 = new Car("Ferrai " , 300, 4);
        Car car2 = new Car("pagani ", 120, 3);       // Using copy Constructor

        car1.details();
        car2.details();
    }
}