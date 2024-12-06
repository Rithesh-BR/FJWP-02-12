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
    void fly() { // Overridden method
        System.out.println("Cargo plane is flying at low heights");
    }

    void carryCargo() { // Specialized method
        System.out.println("Cargo plane carries cargo");
    }
}

class FighterPlane extends Plane { // Child class

    @Override
    void fly() { // Overridden method
        System.out.println("Fighter plane is flying at medium heights");
    }

    void carryWeapons() { // Specialized method
        System.out.println("Fighter plane carries weapons");
    }
}

class PassengerPlane extends Plane { // Additional child class

    @Override
    void fly() { // Overridden method
        System.out.println("Passenger plane is flying at high altitudes");
    }

    void carryPassengers() { // Specialized method
        System.out.println("Passenger plane carries passengers");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();
        PassengerPlane pp = new PassengerPlane();

        // Calling methods on CargoPlane
        cp.takeoff();
        cp.fly();
        cp.land();
        cp.carryCargo();

        System.out.println("====================================");

        // Calling methods on FighterPlane
        fp.takeoff();
        fp.fly();
        fp.land();
        fp.carryWeapons();

        System.out.println("====================================");

        // Calling methods on PassengerPlane
        pp.takeoff();
        pp.fly();
        pp.land();
        pp.carryPassengers();
    }
}
