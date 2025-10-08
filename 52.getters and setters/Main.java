class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Mehods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger", "Yellow", 10000);

        // car.model = "Corvette"; // The field Car.model is not visible

        // System.out.println(car.color + " " + car.model + " " + car.price); // The fields Car.color, Car.model, Car.price are not visible

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        
        // car.color = "Blue"; // The field Car.color is not visible
        // car.price = 5000; // The field Car.price is not visible
        
        // car.setModel("Corvette"); // The method setModel(String) is undefined for the type Car
        car.setColor("Blue");
        // car.setPrice(5000);
        car.setPrice(-100);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        
    }
}
