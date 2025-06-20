package MultiThreading;

public class RunnableMain {
    public static void main(String[] args) {
        System.out.println("going inside main method: " + Thread.currentThread().getName());
        MultiThreading multiThreadingObj = new MultiThreading();
        Thread thread = new Thread(multiThreadingObj); //thread creation
        thread.start(); //thread start
        System.out.println("finish main method: " + Thread.currentThread().getName());
    }
}
