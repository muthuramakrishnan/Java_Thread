package com.muthu;

class MyThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0; i<10; i++){
                System.out.print("Hello: ");
                Thread.sleep(2000);
                System.out.println("Dhoni");
            }
        }
        catch(InterruptedException ie){
            System.out.println("Interrupted exception occurred" + ie);
        }

    }
}
public class MultiThreading {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
    }
}
