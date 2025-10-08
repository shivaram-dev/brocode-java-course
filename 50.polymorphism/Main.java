class Main {
    public static void main(String[] args) {
        
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();
        
        // Car[] cars = {car, bike, boat}; // Type mismatch: cannot convert from Bike to Car
        // Bike[] bikes = {car, bike, boat}; // Type mismatch: cannot convert from Car to Bike
        // Boat[] boats = {car, bike, boat}; // Type mismatch: cannot convert from Car to Boat
        
        // Vehicle[] vehicles = {car, bike, boat};

        // for (Vehicle vehicle : vehicles) {
        //     vehicle.go();
        // }

        VehicleInterface[] vehicleInterfaces = {car, bike, boat};

        for (VehicleInterface vehicleInterface : vehicleInterfaces) {
            vehicleInterface.go();
        }


    }
}
