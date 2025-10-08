public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
        
            } 
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            if (i == 10) {
                System.out.println("Time's up!");
                System.exit(0);
            }
        }
    }
    
}
