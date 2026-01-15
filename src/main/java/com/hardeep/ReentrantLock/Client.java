package com.hardeep.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {

        sharedResource sharedResource1 = new sharedResource();

        ReentrantLock lock = new ReentrantLock();
        Thread th1 = new Thread(()->{
            try {
                sharedResource1.producer(lock);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        sharedResource sharedResource2 = new sharedResource();
        Thread th2 = new Thread(()->{
            try {
                Thread.sleep(2000);
                sharedResource2.producer(lock);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        th1.start();
        th2.start();
    }
}
