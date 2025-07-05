package ObjectOrientedProgramBasic;

class X {
    static int count = 0;

    static {
        System.out.println("Static block in X");
    }

    X() {
        count++;
        System.out.println("Constructor X");
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        System.out.println("Main method started");
        X x1 = new X();
        X x2 = new X();
        System.out.println("Objects created: " + X.count);
    }
}

/*
 * static blocks are executed when the class is loaded, before any objects are created.
 * They are used for static initialization of the class.
 * Static blocks run only once per class — when the class is loaded for the first time.
 */