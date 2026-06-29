package oops_practice.gcr_codebase.Java_Polymorphism;
class Vehicle {

    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String name) {
        super(name);
    }

    @Override
    double fuelCost(int km) {
        return km * 6.5;
    }
}

class Bus extends Vehicle {

    Bus(String name) {
        super(name);
    }

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    Bike(String name) {
        super(name);
    }

    @Override
    double fuelCost(int km) {
        return km * 2;
    }
}

// New class added without modifying existing classes
class ElectricCar extends Vehicle {

    ElectricCar(String name) {
        super(name);
    }

    @Override
    double fuelCost(int km) {
        return km * 1.5;
    }
}

public class FleetDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Swift"),
                new Bus("Volvo"),
                new Bike("Splendor"),
                new ElectricCar("Tesla")
        };

        int km = 100;

        for (Vehicle v : vehicles) {

            System.out.println(v.vehicleName +
                    " Fuel Cost = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}
