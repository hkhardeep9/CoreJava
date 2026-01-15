package com.hardeep.scaler.multithreading;

public class Client {
    public static void main(String[] args) {
        System.out.println("hello world " + Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t1 = new Thread(hwp);
        t1.start();
        System.out.println("hello world " + Thread.currentThread().getName());
    }
}
