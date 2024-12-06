class Plane { // Parent class
    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane { // Child class
    @Override
    void fly() {
        System.out.println("Cargo plane is flying at low heights");
    }

    void carryCargo() { // Specialized method
        System.out.println("Cargo plane carries cargo");
    }
}

class FighterPlane extends Plane { // Child class
    @Override
    void fly() {
        System.out.println("Fighter plane is flying at medium heights");
    }

    void carryWeapons() { // Specialized method
        System.out.println("Fighter plane carries weapons");
    }
}

class PassengerPlane extends Plane { // Child class
    @Override
    void fly() {
        System.out.println("Passenger plane is flying at high altitudes");
    }

    void carryPassengers() { // Specialized method
        System.out.println("Passenger plane carries passengers");
    }
}

public class Demo {
    public static void main(String[] args) {
        Plane ref; // Parent class reference

        // Referring to CargoPlane
        ref = new CargoPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
        ((CargoPlane) ref).carryCargo(); // Downcasting to call subclass-specific method

        System.out.println("====================================");

        // Referring to PassengerPlane
        ref = new PassengerPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
        ((PassengerPlane) ref).carryPassengers(); // Downcasting to call subclass-specific method

        System.out.println("====================================");

        // Referring to FighterPlane
        ref = new FighterPlane();
        ref.takeoff();
        ref.fly();
        ref.land();
        ((FighterPlane) ref).carryWeapons(); // Downcasting to call subclass-specific method
    }
}
