package main.java.threads;

// In Java, daemon threads are low-priority threads that run in the background to perform tasks such as garbage
// collection or provide services to user threads. The life of a daemon thread depends on the mercy of user threads,
// meaning that when all user threads finish their execution, the Java Virtual Machine (JVM) automatically terminates the daemon thread.
// To put it simply, daemon threads serve user threads by handling background tasks and have no role other than supporting the main execution.

public class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Deamon thread is running");
        }
    }
}

class UserThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User thread finishes execution...");
    }
}

class Main {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonThread());
        daemonThread.setDaemon(true);
        Thread userThread = new Thread(new UserThread());

        daemonThread.start();
        userThread.start();
    }
}

