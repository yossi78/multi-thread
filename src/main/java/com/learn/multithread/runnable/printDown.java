package com.learn.multithread.runnable;


public class printDown implements Runnable{


    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        for(int i=5;i>=1;i--){
            System.out.println(threadName+" - [" + i + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(threadName+" finished");
    }


}
