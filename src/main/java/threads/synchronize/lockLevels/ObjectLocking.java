package main.java.threads.synchronize.lockLevels;
//        Synchronized statements are also useful for improving concurrency with fine-grained synchronization. Suppose,
//        for example, class MsLunch has two instance fields, c1 and c2, that are never used together.
//        All updates of these fields must be synchronized,
//        but there's no reason to prevent an update of c1 from being interleaved with an update of c2 — and
//        doing so reduces concurrency by creating unnecessary blocking. Instead of using synchronized methods or
//        otherwise using the lock associated with this, we create two objects solely to provide locks.
public class ObjectLocking {
    private long c1 = 0;
    private long c2 = 0;
    private Object lock = new Object();

    public void inc1() {
        synchronized(lock) {
            c1++;
        }
    }

    public void inc2() {
        synchronized(lock) {
            c2++;
        }
    }
}

