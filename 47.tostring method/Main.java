class Main {
    public static void main(String[] args) {
        
        // toString() = Method inherited from the Object class.
        //              Used to return a string representation of an object.
        //              By default, it returns a hash code as a unique identifier.
        //              It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        // System.out.println(car1);
        // Before toString() method
        // Output: Car@7344699f
        
        // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
        System.out.println(car1);
        System.out.println(car2);
        // After toString() method
        // Output: Red 2025 Ford Mustang
        // Output: Blue 2026 Chevrolet Corvette

    }
}
