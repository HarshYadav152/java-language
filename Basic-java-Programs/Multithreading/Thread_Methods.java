package Multithreading;

class TM extends Thread{
    public TM(String name){
        super(name); // it will create thread with name
    }
    public void run(){
        int i = 0;
        while (i<10){
            System.out.println("I am a thread : "+this.getName());
            i++;
            // interrupt in Threads
            try {
                Thread.sleep(1000); // this thread stop for every 1 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        TM obj1 = new TM("th1");
        TM obj2 = new TM("th2");
        // .start() will start both Threads concurrently
        obj1.start();
        // but if we want to start thread obj2 after obj1 complete its execution
        // then use .join()
        //obj1.join(); // it will give an error because it may raise an exception
        // so we have to handle this exception using try{} catch(){} block
//        try{
//            obj1.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
        // obj2 thread run after obj1 completion
        obj2.start();
    }
}
