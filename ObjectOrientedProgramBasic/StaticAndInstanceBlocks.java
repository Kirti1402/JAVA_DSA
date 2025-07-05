package ObjectOrientedProgramBasic;

class Demo {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    Demo() {
        System.out.println("Constructor");
    }
}

public class StaticAndInstanceBlocks {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
// Output:
// Static block
// Instance block
// Constructor
// Instance block
// Constructor  

// staic block is not tied to any object
// instance block is tied to the object