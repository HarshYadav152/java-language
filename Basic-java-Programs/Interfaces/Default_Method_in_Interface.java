package Interfaces;
interface Camera{
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
interface WiFi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}

class SmartPhone extends CellPhone implements WiFi,Camera {
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

public class Default_Method_in_Interface {
    public static void main(String[] args) {
        SmartPhone samsungS24 = new SmartPhone();
        String[] network = samsungS24.getNetwork();
        for (String item : network){
            System.out.println(item);
        }
        samsungS24.take4Kvideo();
//        samsungS24.Greet(); // throws an error
    }
}
