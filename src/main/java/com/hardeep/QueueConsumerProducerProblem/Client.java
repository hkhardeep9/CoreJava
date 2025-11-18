package com.hardeep.QueueConsumerProducerProblem;

public class Client {
    public static void main(String[] args) {
        SharedResource sharedBuffer = new SharedResource(3);
        Thread producerThread = new Thread(()->{
            try{
                for(int i = 1 ; i <= 6 ; i++){
                    sharedBuffer.produce(i);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumerThread = new Thread(()->{
            for(int i = 1 ; i <= 6 ; i++){
                try {
                    sharedBuffer.consume();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
