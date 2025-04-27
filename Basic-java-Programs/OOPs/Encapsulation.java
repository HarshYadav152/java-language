package OOPs;

// Java program demonstrating Encapsulation
class Programmer {
    private String name;

    // Getter and Setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

public class Encapsulation {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Harsh"); // only show the functionality not the implementation means what doing in the background
        System.out.println("Name => " + p.getName());
    }
}
