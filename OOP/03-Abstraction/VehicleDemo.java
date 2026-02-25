abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car starts with a Key.");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike starts with a Kick.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
    
}
