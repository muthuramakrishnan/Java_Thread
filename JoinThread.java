package com.muthu;

class MyThread1 implements Runnable{
    public void run(){
        try{
            for(int i=0; i<10; i++){
                System.out.println("Child thread executing");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException ie){
            System.out.println(ie);
        }
    }
}
public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 r = new MyThread1();
        Thread t = new Thread(r);
        t.start();
        Thread.currentThread().setPriority(10);
        t.join();
        System.out.println("this line will be executed very last");
        System.out.println(Thread.currentThread().getName());
    }
}
