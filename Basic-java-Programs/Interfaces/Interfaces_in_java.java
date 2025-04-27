package Interfaces;
interface Bycycle{ // we have to implement this in another class
    int a = 8; // interface can also have properties
    void applyBrake(int decrement); // must be overriden
    void speedUp(int increment); // must be overriden
}

interface HornBycycle{
    void BlowHornYMD(); // these are public bydefault
    public void BlowHornMHN();
}
// --->> here Bycycle is a type of protocol which is implement by other like AtlasCycle or AvonCycle

// class ElectricBycicle extends AvonCycle implements Bycycle{} // also do this
//interface hello extends HornBycycle{}

class AvonCycle implements Bycycle,HornBycycle{
    // here we have to override appplyBrake() and speedUp() in this class
    @Override
    public void applyBrake(int decrement) { // this must be public when we override a interface abstract method in class
        System.out.println("Apply brake");
    }
    @Override
    public void speedUp(int increment) { // this must be public when we override a interface abstract method in class
        System.out.println("speed up");
    }

    void horn(){
        System.out.println("POOO");
    }

    @Override
    public void BlowHornMHN() {
        System.out.println("Mai hoo na horn");
    }
    @Override
    public void BlowHornYMD() {
        System.out.println("Yamla pagle deewana horn");
    }
}
public class Interfaces_in_java {
    public static void main(String[] args) {
        // interface is a group of methods which are implement in class after
        // used for achieve abstraction and multiple inheritance

        // interface ke saare method abstract method hai ek baar method bana diya toh inhe override karna padega inheritance

        // we can't create a object of that inheritance but it can be reference

        // ----------------------------------------------------------------------------
        // we can not create a class using multiple abstract class but using interface it is possible (multiple inheritance

        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(2);

        // we can't modify properties in interface because this is final after creating interface
        // cycle.a = 3;

        cycle.BlowHornMHN();
//          Class             I              I                  I
//      cell-phone           GPS           Camera          Media Player
//          |                 |               |                  |
//          |                 |               |                  |
//         \/                \/               \/                 \/
//          -------------     ------          ------              ------
//                      |           |              |                    |
//                      |           |              |                    |
//                      Smart Phone

        // interface can't implement another interface
    }

}
