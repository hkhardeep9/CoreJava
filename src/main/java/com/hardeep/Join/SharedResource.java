package com.hardeep.Join;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() throws InterruptedException {
        System.out.println("Lock acquired");
        isAvailable = true;
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {

        }
        System.out.println("Lock released");
    }
}
