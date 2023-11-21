package threads.tasks.files;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FileReader collection1 = new FileReader();
        FileReader collection2 = new FileReader();
        FileReader collection3 = new FileReader();

        Thread t1 = new Thread(collection1::readFile);
        Thread t2 = new Thread(collection2::readFile);
        Thread t3 = new Thread(collection3::readFile);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
