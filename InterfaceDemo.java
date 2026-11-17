abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Bike starts with a button.");
    }
}

class Bus extends Vehicle {

    Bus(String brand) {
        super(brand);
    }

    void start() {
        System.out.println("Bus starts with a key.");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("Toyota"),
            new Bike("Honda"),
            new Bus("Volvo")
        };

        for (Vehicle v : vehicles) {
            v.showBrand();
            v.start();
            System.out.println();
        }
    }
}
