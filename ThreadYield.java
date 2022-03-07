package com.muthu;

class MyThreadRunnable implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello I'm from thread");
            Thread.yield(); //If there's any other thread awaiting to be executed, then this gives chance for that thread
            //but not guaranteed in all OS
        }
    }
}
public class ThreadYield {
    public static void main(String[] args){
        MyThreadRunnable r = new MyThreadRunnable();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++){
            System.out.println("From main method");
        }
    }
}
