public class test {
    public static void main(String[] args) {
        Vehicle vehicle = new Cars();
        vehicle.drive();
    }
}

class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Cars extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}