package com.learn.multithread;
import java.util.ArrayList;
import java.util.List;



public class ThreadTest {


    public static void runListOfThreadsTest() {
        printDown printDown =new printDown();
        printUp printUp =new printUp();
        Thread treadDown = new Thread(printDown,"Thread_Down");
        Thread treadUp = new Thread(printUp,"Thread_Up");
        runThreadList(treadDown,treadUp);
    }


    private static void runThreadList(Thread ... threads){
        List<Thread> threadList=new ArrayList<>();
        for (Thread current : threads)
        {
            threadList.add(current);
        }
        threadList.stream().forEach(Thread::start);
    }


    public static void multiTreadTest() {
        printDown printDown =new printDown();
        printUp printUp =new printUp();
        Thread treadDown = new Thread(printDown,"Thread_Down");
        Thread treadUp = new Thread(printUp,"Thread_Up");
        treadUp.start();
        treadDown.start();
    }


    public static void treadAfterTreadTest() throws InterruptedException {
        printDown printDown =new printDown();
        printUp printUp =new printUp();
        Thread threadUp = new Thread(printUp,"Thread_Down");
        Thread threadDown = new Thread(printDown,"Thread_Up");
        threadUp.start();
        threadUp.join(); // ALL THREADS WAIT TILL THREAD_UP  WILL FINISH HIS WORK
        threadDown.start();
    }


    public static void main(String[] args) throws InterruptedException {
//        treadAfterTreadTest();
//        multiTreadTest();
        runListOfThreadsTest();

    }


}
