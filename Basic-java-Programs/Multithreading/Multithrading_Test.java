package Multithreading;

class MyThread extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("MyThread is running");
            System.out.println("Happy world");
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("MyThread1 is running");
            System.out.println("Happy world 1");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("MyThread2 is running");
            System.out.println("Happy world 2");
        }
    }
}
public class Multithrading_Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread1 t1 = new MyThread1();
        // sometimes it run t and sometimes it run t1 maintaining concurrency
        // concurrency in multithreading
        t.start(); // for start thread execution
        t1.start(); // for start thread execution
    }
}
