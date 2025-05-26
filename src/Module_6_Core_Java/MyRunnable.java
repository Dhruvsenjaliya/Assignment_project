package Module_6_Core_Java;

//Thread creation using Runnable interface
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// Code to execute in the new thread
		for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
	
    public static void main(String[] args) {
       // Create an object of the class implementing Runnable
       MyRunnable myRunnable = new MyRunnable();

       // Pass it to a Thread object
       Thread thread = new Thread(myRunnable);

       // Start the thread
       thread.start();

       // Main thread continues
       System.out.println("Main thread continues...");
}
}
	
	


