package com.learn.multithread;

import com.learn.multithread.runnable.MyRunnable;
import com.learn.multithread.theads.MyThread;

public class Main{



    public static void main(String[] args){
       MyThread thread1 =new MyThread();
       MyRunnable myRunnable=new MyRunnable();
       Thread thread2=new Thread(myRunnable);
       thread1.start();
       thread2.start();
    }



}
