public class Hawk implements Predator {

    // Cannot reduce the visibility of the inherited method from Prey
    // That's why we made it public
    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting*");
    }
    
}
