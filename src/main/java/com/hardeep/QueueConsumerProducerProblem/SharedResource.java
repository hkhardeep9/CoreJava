package com.hardeep.QueueConsumerProducerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception{
        //If buffer is full wait for consumer to consume items
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produced: " + item);
        notify();
    }

    public synchronized int consume() throws Exception{
        //Buffer is empty, wait for producer to produce items
        while(sharedBuffer.size() == 0){
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed: " + item);
        notify();
        return item;
    }
}
