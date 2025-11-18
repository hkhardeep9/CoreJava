package com.hardeep.MultiThreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside main method: " + Thread.currentThread().getName());
        MultiThreadingLearning runnableObj = new  MultiThreadingLearning();
        Thread thread1 = new Thread(runnableObj);
        thread1.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}