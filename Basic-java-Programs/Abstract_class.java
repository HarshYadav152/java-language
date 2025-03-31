// Demonstrating Abstraction in Java
// this is abstract class
abstract class TV {
    // these methods must be implemented in the subclass // demonstrating abstraction
    abstract void turnOn();
    // these abstract can be implemented in many different ways
    abstract void turnOff();

    public TV(){
        System.out.println("This is TV constructor");
    }
}

// if we inherit from a abstract class so we must override the abstract method of inherited class

// Concrete class implementing the abstract methods
class TVRemote extends TV {
    @Override
    void turnOn() { // overriding the abstract class abstract method
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}


public class Abstract_class {
    public static void main(String[] args) {
        TV remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

