package com.muthu;

class Display{
    public synchronized void wish(String name){
        for(int i=0; i<10; i++){
            System.out.println("Good Morning");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(name);
        }
    }
}
class MyThread2 extends Thread{
    Display d;
    String name;

    MyThread2(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run(){
        d.wish(this.name);
    }
}
public class SynchronizationExample {
    public static void main(String[] args){
        Display d = new Display();
        MyThread2 t = new MyThread2(d, "dhoni");
        MyThread2 t1 = new MyThread2(d, "Raina");
        MyThread2 t2 = new MyThread2(d, "Yuvi");
        t.start();
        t1.start();
        t2.start();
    }
}
