

public class Mavenproject1 {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", 180);

        System.out.println(vehicle1.getBrand());
        System.out.println(vehicle1.getSpeed());
        vehicle1.start();

        Car car1 = new Car("Honda", 200, "Petrol");

        System.out.println(car1.getBrand());
        System.out.println(car1.getSpeed());
        car1.start();
        car1.drive();
        car1.drive("Nahid");

        ElectricCar electricCar1 =
                new ElectricCar("Tesla", 250, "Electric");

        System.out.println(electricCar1.getBrand());
        System.out.println(electricCar1.getSpeed());
        electricCar1.start();
        electricCar1.drive();
        electricCar1.drive("Nahid");
    }
}


class Vehicle {

    String brand;
    int speed;

    Vehicle(String Brand, int speed) {

        this.brand = Brand;
        this.speed = speed;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String Brand) {
        this.brand = Brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("Start");
    }

    public void start(String Brand) {
        System.out.println(Brand + " Starting Vehicle");
    }
}


class Car extends Vehicle {

    String fuelType;

    Car(String Brand, int Speed, String fuelType) {

        super(Brand, Speed);
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void start(String Brand) {
        System.out.println(Brand + " Starting Car");
    }

    public void drive() {
        System.out.println("Car is driving normally");
    }

    public void drive(String driverName) {
        System.out.println(driverName + " is driving Car");
    }
}


class ElectricCar extends Car {

    ElectricCar(String Brand, int Speed, String fuelType) {

        super(Brand, Speed, fuelType);
    }

    @Override
    public void drive(String driverName) {
        System.out.println(driverName + " is driving Electric Car");
    }
}
