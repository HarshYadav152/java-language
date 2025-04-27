package Interfaces;
interface Camera2{
    public void takePhoto();
    public void takeVideo();

    // we can also use private
    private void Greet(){
        System.out.println("Good");
    }
    // we can also add default method in this for not being re implement in class
    default void take4Kvideo(){ // we don't need to implement this in class
        // can be used inside default method but not anywhere
        Greet();
        System.out.println("Recording in 4k");
    }
    // if we want to override this in class SmartPhone
}
interface WiFi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class SmartPhone2 extends CellPhone2 implements WiFi2,Camera2 {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo");
    }
    @Override
    public void takeVideo() {
        System.out.println("Taking video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting network details");
        return new String[]{"Airtel","Jio"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }

    void useCamera() {
        System.out.println("Camera has been used");
    }
}

public class Polymorphism_interface {
    public static void main(String[] args) {
        Camera2 cam = new SmartPhone2(); // this is a smartphone but use it as a camera
        //cam.getNetwork(); // jab smartphone ko camera ke tarah use karenge toh uska smartphone se koi matlab nahi hai
        // aur na hi uske method use kar sakte
        cam.takePhoto(); // this can be used
        // we can only use methods from Camera2 interface

        // this is the polymorphsm where smartphone can have multiple forms like camera and wifi

        // very similar to Dynamic Method Dispatch

//        -----------------------------------------
        SmartPhone2 s = new SmartPhone2();
//        this can use every method
        s.getNetwork();
        s.takePhoto();
        s.callNumber(23456);
    }

}