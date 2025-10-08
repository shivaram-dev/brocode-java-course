class Main {
    public static void main(String[] args) {

        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Supports multiple inheritance-like behaviour.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        // rabbit doesn't have hunt() method and hawk doesn't have flee() method
        // rabbit.hunt();
        // hawk.flee();

        fish.flee();
        fish.hunt();
        
    }
}
