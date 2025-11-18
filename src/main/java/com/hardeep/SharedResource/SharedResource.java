package com.hardeep.SharedResource;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("Producer thread callling the notifyAll method");
        notifyAll();
    }
    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumer item method");
        while(isItemPresent == false){
            try{
                System.out.println("Consumer Thread waiting for item");
                wait();
            }
            catch(Exception e){
                //exception handling code here
            }
        }
        System.out.println("Consumer thread consumed the item");
        isItemPresent = false;
    }
}
