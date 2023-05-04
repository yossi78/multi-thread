package com.learn.multithread;

import com.learn.multithread.runnable.MyRunnable;
import com.learn.multithread.theads.Thread1;

public class Main{



    public static void main(String[] args){
       Thread1 thread1=new Thread1();
       MyRunnable myRunnable=new MyRunnable();
       Thread thread2=new Thread(myRunnable);
       thread1.start();
       thread2.start();
    }



}
