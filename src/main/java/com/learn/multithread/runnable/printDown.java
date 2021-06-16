package com.learn.multithread.runnable;


public class printDown implements Runnable{


    @Override
    public void run() {
        for(int i=5;i>=1;i--){
            System.out.println("Thread_Down - [" + i + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread_Down finished");
    }


}
