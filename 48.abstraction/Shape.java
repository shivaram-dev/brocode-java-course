public abstract class Shape {
    
    abstract double area(); // ABSTRACT

    // Child classes do not need to implement concrete methods
    void display() { // CONCRETE
        System.out.println("This is a shape");
    }
}
