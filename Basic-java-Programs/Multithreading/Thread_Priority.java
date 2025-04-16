package Multithreading;

class TP extends Thread{
    public TP(String name){
        super(name); // it will create thread with name
    }
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am a thread : "+this.getName());
            i++;
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        // JVM maintain Ready Queue for threads T1,T2,T3,T4,T5
        TP obj1 = new TP("Prashant");
        TP obj2 = new TP("Sonali");
        TP obj3 = new TP("Ana");
        TP obj4 = new TP("Hello");
        TP obj5 = new TP("Senger (Most priority to this)"); // so i add priority to this thread
        obj5.setPriority(Thread.MAX_PRIORITY);//now it have a max riority so it run first
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj4.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        obj5.start();
    }
}
