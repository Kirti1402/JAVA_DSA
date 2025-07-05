package ObjectOrientedProgramBasic;

class A {
    static int counter = 0;
    int id;

    A() {
        id = ++counter;
        System.out.println("A Constructor: ID = " + id);
    }

    void display() {
        System.out.println("Display from A: ID = " + id);
    }
}

class B {
    A objA = new A(); // Instance variable initialized when B object is created

    B() {
        System.out.println("B Constructor");
        objA.display();
    }
}

public class BasicClassObjectPrac1 {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B();
    }
}


/**
 * Dry Run:
 * 1. First, an obj1 will be created, which will invoke the constructor of class B.
 * 2. Inside B's constructor, an instance of A is created, which will invoke
 *   the constructor of class A, incrementing the static counter and setting id.
 * Output:
 * A Constructor: ID = 1
 * B Constructor
 * Display from A: ID = 1
 * 3. Next, an obj2 will be created, which will again invoke B'sconstructor.
 * 4. A new instance of A is created, incrementing the static counter again
 *   and setting a new id.
 * Output:
 * A Constructor: ID = 2
 * B Constructor
 * Display from A: ID = 2
 * Question:
 * What if counter was not static?
 * If counter was not static, each instance of class A would have its own
 * counter, and the id would not be unique across different instances of A.
 * Each time a new instance of A is created, it would reset the counter to 0
 * for that instance, leading to duplicate IDs.
 */

/**
 * Static variables and methods belong to the class, not to a specific object.
 * So, they are shared among all the objects of that class.
 * On the other hand, non-static variables and methods are tied to each object,
 * meaning every object will have its own separate copy.
 *
 * In this code, the static variable 'counter' helps keep track of how many
 * objects of class A have been created. It increases each time a new object is made,
 * so every object gets a unique ID.
 *
 * If we made 'counter' non-static, then each object of class A would have its
 * own counter, and the ID would always start from 1 for each new object.
 * That would make the IDs not unique, which is not what we want.
 */