package com.hardeep.scaler.Executors;

public class NumberPrinter implements Runnable {
    int numToPrint;
    NumberPrinter(int numToPrint) {
        this.numToPrint = numToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number " + numToPrint + Thread.currentThread().getName());
    }
}
