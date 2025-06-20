package MultiThreading;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("going inside main method: " + Thread.currentThread().getName());
        MultiThread myThread = new MultiThread(); //thread creation
        myThread.start(); //thread start
        System.out.println("finish main method: " + Thread.currentThread().getName());
    }
}
