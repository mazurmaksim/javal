package main.java.threads.tasks.researches;

import java.util.Random;

public class Researcher {
    private Random random;

    public void conductResearch() {
        random = new Random(5000);
        try {
            Thread.sleep(random.nextInt());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
