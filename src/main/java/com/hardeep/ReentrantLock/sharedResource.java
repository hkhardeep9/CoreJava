package com.hardeep.ReentrantLock;

import java.time.LocalTime;
import java.util.concurrent.locks.ReentrantLock;

public class sharedResource {
    boolean isAvailable = false;


    public void producer(ReentrantLock lock) {
        try {

            lock.lock();
            //System.out.println("Lock acquired by :: " + Thread.currentThread().getName());
            System.out.println("[" + LocalTime.now() + "] Lock acquired by :: " + Thread.currentThread().getName()
                    + " | Lock Hash: " + System.identityHashCode(lock));
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {

        }
        finally {
            lock.unlock();
            System.out.println("[" + LocalTime.now() + "] Lock released by :: " + Thread.currentThread().getName());
        }
    }
}
