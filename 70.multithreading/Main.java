class Main {
    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread = new Thread(myRunnable);

        // Thread thread1 = new Thread(new MyRunnable());
        // Thread thread2 = new Thread(new MyRunnable());

        Thread thread1 = new Thread(new MyRunnable("PING"));
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            // Main thread will wait for these 2 threads to finish
        } 
        catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted");
        }

        System.out.println("GAME OVER!");

    }
}
