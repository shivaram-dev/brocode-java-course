public class Rabbit implements Prey {

    // Cannot reduce the visibility of the inherited method from Prey
    // That's why we made it public
    @Override
    public void flee() {
        System.out.println("*The rabbit is running away*");
    }
    
}
