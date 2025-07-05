package ObjectOrientedProgramBasic;
class Example {
    Example() {
        System.out.println("Constructor called");
        printMessage();
    }

    void printMessage() {
        System.out.println("Message from Example");
    }
}

class SpecialExample extends Example {
    @Override
    void printMessage() {
        System.out.println("Overridden message from SpecialExample");
    }

    public static void main(String[] args) {
        Example e = new SpecialExample();
    }
}


// Output:
// Constructor called
// Overridden message from SpecialExample
// Message from Example
//// Explanation:
// - The constructor of `SpecialExample` is called, which in turn calls the constructor
//   of `Example` because `SpecialExample` extends `Example`.
// - The `printMessage` method is overridden in `SpecialExample`, so when it is
//   called from the constructor of `Example`, it executes the overridden version.
// - The output shows the order of execution: first the constructor message, then the
//   overridden message from `SpecialExample`, and finally the message from `Example`.  
