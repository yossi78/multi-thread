package com.learn.multithread.runnable;


public class printUp implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Thread_Up   - [" + i + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread_Up   finished");
    }

}
