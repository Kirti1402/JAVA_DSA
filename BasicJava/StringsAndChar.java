public class StringsAndChar {
    public static void main(String[] args) {
        String str = "Myself Kirt";
        char c = 'C';
        int num = 7;
        System.out.println(str +" "+c);    
        System.out.println((str + num).getClass().getName());
        System.out.println(((Object)(num + num)).getClass().getName());
    }
}

/*
 * Autoboxing: autoboxing is the automatic conversion of primitive types (like int, char) 
 * into their corresponding wrapper classes (Integer, Character, etc.) when an object context is needed.
 * Java Collections Store Objects, Not Primitives.
 * Primitives (like int, char) don’t have methods.
 * Wrapper classes (like Integer, Character) provide useful methods (compareTo(), parseInt(), etc.).
 */
