package com.learn.multithread.runnable;


public class printUp implements Runnable{

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        for(int i=1;i<=5;i++){
            System.out.println(threadName+"   - [" + i + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName+"   finished");
    }

}
