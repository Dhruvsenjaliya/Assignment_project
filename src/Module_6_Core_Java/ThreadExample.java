package Module_6_Core_Java;
//Creating a thread by extending the Thread class
class MyThread extends Thread {

    // Override the run() method
    @Override
    public void run() {
        // Code that runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExample {
	public static void main(String[] args) {
        // Create an object of the thread class
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        // Main thread continues
        System.out.println("Main thread continues...");
    }
}

