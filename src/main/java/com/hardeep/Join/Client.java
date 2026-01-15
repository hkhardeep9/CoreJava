package com.hardeep.Join;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main Thread started");

        Thread th1 = new Thread(()->{
            System.out.println("Thread1 calling produce method");
            try {
                sharedResource.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        //1 means low priority
        //10 means low priority
        th1.setPriority(Thread.MIN_PRIORITY);
        th1.start();

        th1.join();
        System.out.println("Main thread is finishing its work");
    }
}
