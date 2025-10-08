// public class Bike extends Vehicle {
public class Bike implements VehicleInterface {

    @Override
    public void go() {
        System.out.println("You ride the bike");
    }
    
}
