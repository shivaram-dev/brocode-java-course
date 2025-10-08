public class Fish extends Animal {
    
    // This is like a override comment to just indicate other developers that this method is overridden, the overridden method will still work without it
    // The method name should be exactly same as the method in parent class to be overridden
    @Override
    void move() {
        System.out.println("This animal is swimming");
    }

}
