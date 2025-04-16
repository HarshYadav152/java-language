package Multithreading;

class TC extends Thread{
    public TC(String name){
        super(name); // it will create thread with name
    }
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
        TC obj = new TC("Harsh");
        obj.start(); // start thread by another constructor
        TC obj2 = new TC("Pr");

        System.out.println("Id of thread is "+obj.threadId()); // print thread it getId() is deprecated
        System.out.println("Id of thread2 is "+obj2.threadId()); // print thread it getId() is deprecated
        System.out.println("Name of the thread "+obj.getName());
        System.out.println("Name of the thread2 "+obj2.getName());
    }
}
