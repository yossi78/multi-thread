package com.learn.multithread.runnable;

public class Main{



    public static void main(String[] args){
       Thread1 thread1=new Thread1();
       Thread thread2=new Thread2();
       thread1.start();
       thread2.start();
    }



}
