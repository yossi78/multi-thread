package com.learn.multithread.utils;



public class Counter {

    public  int wrongCounter=0;
    public  int rightCounter=0;


    public  void wrongIncrement(){
        wrongCounter++;
    }



    public synchronized void rightIncrement(){
        rightCounter++;
    }



}
