public class EvenOdd {
    public static void main(String[] arg){
        evenOddCheck(5);
        evenOddCheck(2);
        evenOddCheck(8);
        evenOddCheck(1);
        evenOddCheck(0);
        evenOddCheck(9);
        evenOddCheck(1245436251);


    }
    static void evenOddCheck(int num){
        if(num%2 ==0){
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
