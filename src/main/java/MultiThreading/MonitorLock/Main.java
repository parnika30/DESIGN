package MultiThreading.MonitorLock;

public class Main {

    public static void main(String[] args) {
        MonitorLockExample monitorLockExample = new MonitorLockExample();

//        monitor lock by thread 1 on monitorLockExample
//        for thread 2 to execute, monitor lock by t1 has to be released. since t2 will also try to access the same object
//        monitor lock allows only 1 thread to go inside the critical section (synchronized block)

        Thread t1 = new Thread(monitorLockExample::task1);
        Thread t2 = new Thread(monitorLockExample::task2);
        Thread t3 = new Thread(monitorLockExample::task3); // new Thread(() -> {monitorLockExample.task2();});

        t1.start();
        t2.start();
        t3.start();
    }
}
