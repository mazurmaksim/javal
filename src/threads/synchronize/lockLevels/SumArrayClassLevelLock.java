package threads.synchronize.lockLevels;

//    Task: Sum of Array Elements in Parallel Threads
//
//    You have an array of integers. Your task is to write a Java program that creates multiple threads to calculate
//    the sum of the array elements in parallel threads and then prints the total sum.
//
//            Requirements:
//
//    Create an array of integers, for example, int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}.
//            Create several threads to calculate the sum of the array elements in parallel.
//    Each thread should compute the sum of a portion of the array elements and add it to the total sum.
//    Display the total sum on the screen.
//
//    Your task is to correctly organize synchronization between the threads to avoid data races.
//
//    Try to create a program that solves this task.

public class SumArrayClassLevelLock {

    private static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int totalSum;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int partialSum = 0;
            for (int i = 0; i<numbers.length/2; i++) {
                partialSum += numbers[i];
            }
            synchronized (SumArrayClassLevelLock.class) {
                totalSum += partialSum;
            }
        });

        Thread t2 = new Thread(()-> {
            int partialSum = 0;
            for (int i = 0; i< numbers.length/2; i++) {
                partialSum += numbers[numbers.length - i -1];
            }
            synchronized (SumArrayClassLevelLock.class) {
                totalSum += partialSum;
            }
        });
        t1.start();
//       It is used to wait for the completion of thread t1 before continuing the execution of the main thread.
//       This is done to ensure that the result of executing t1 (the sum of elements in t1)
//       is available when we start calculating the total sum.
//       Without the t1.join(); line, there is a risk that the main thread might try to access totalSum before t1
//       completes its work, which could lead to incorrect results. Using join, we ensure that
//       the main thread doesn't proceed until t1 has finished its work.
//
//       So, t1.join(); guarantees the correct order of thread execution and ensures the proper calculation of the total sum.
        t1.join();
        t2.start();
        t2.join();
//        t2.start();
        System.out.println(totalSum);
    }
}
