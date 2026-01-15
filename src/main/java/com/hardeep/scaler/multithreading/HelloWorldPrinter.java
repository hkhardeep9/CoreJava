package com.hardeep.scaler.multithreading;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        System.out.println("hello world " + Thread.currentThread().getName());
    }
}
