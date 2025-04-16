package Multithreading;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
        System.out.println("hello 1 PS");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
        System.out.println("hello 2 HY");
    }
}
public class Multithreading_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1); // here we create new thread and then run with bullet1 object

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        // here .start() not directly available

        gun1.start();

        gun2.start();
        System.out.println("id and name is : "+gun1.threadId() + gun1.getName());
    }
}
