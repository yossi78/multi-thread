package com.learn.multithread;
import com.learn.multithread.utils.Counter;



public class SyncronizeTest {


    public static void syncPrintActionsTest() throws InterruptedException {
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.wrongIncrement();
                    c.rightIncrement();
                }

            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    c.wrongIncrement();
                    c.rightIncrement();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join(); // DO NOT CONTINUE TILL T1 THREAD FINISH TO WORK
        t2.join(); // DO NOT CONTINUE TILL T2 THREAD FINISH TO WORK
        System.out.println("wrong counter="+c.wrongCounter);
        System.out.println("right counter="+c.rightCounter);

    }


    public static void main(String[] args) throws InterruptedException {
        syncPrintActionsTest();
    }




}
