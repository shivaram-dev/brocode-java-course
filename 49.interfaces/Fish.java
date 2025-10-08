public class Fish implements Prey, Predator {

    // Cannot reduce the visibility of the inherited method from Prey
    // That's why we made it public
    @Override
    public void flee() {
        System.out.println("*The fish is swimming away*");
    }

    // Cannot reduce the visibility of the inherited method from Prey
    // That's why we made it public
    @Override
    public void hunt() {
        System.out.println("*The fish is hunting*");
    }
    
}
