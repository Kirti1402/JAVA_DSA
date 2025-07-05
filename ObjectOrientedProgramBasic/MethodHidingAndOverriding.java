package ObjectOrientedProgramBasic;

class Parent {
    static {
        System.out.println("Parent static block");
    }
    static void show() {
        System.out.println("Parent static show()");
    }
    void print() {
        System.out.println("Parent print()");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }
    static void show() {
        System.out.println("Child static show()");
    }
    void print() {
        System.out.println("Child print()");
    }
}

public class MethodHidingAndOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();   // Reference type is Parent → Parent.show() is called
        p.print();  // ??
    }
}


/*
 * You're creating a Child object but referencing it with a Parent type reference (p).
 * This is called upcasting.
 * JVM knows that p is a Parent reference, but the actual object is of type Child.
 */


 /*
  * Because show() is static.
  Static methods are not overridden, they are hidden.
  Method call is resolved at compile-time using reference type, not object type.
  */

  /*
   * print() is a non-static (instance) method.
   * Instance methods are overridden.
   * JVM uses runtime polymorphism to call the method of the actual object, not reference type.
   */
