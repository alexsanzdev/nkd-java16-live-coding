package live_coding.threads;

import java.util.ArrayList;

public class ThreadExample {

    public static void main(String[] args) {
        System.out.println("main körs");
        System.out.println(Thread.currentThread());

        Thread newThread = new Thread(() -> {
            System.out.println("ny tråd 1 körs");
            System.out.println(Thread.currentThread());
        });

        Thread newThread2 = new Thread(() -> {
            System.out.println("ny tråd 2 körs");
            System.out.println(Thread.currentThread());
            while(true) {
                try {
                    System.out.println("Still alive...");
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    new ArrayList().get(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        newThread.start();
        newThread2.start();

        System.out.println("main klar");
    }

}
