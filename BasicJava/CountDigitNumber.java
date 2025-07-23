
public class CountDigitNumber {
    public static void main(String[] args) {
        countDigit(3455);
        countDigit(0);
    }

    public static void countDigit(int n){
        int count=0;
        if(n<=0){
                System.out.println("Digit is less than or equal to 0");
                return;
            }
        while (n>0) {            
            n = n /10;
            count++;       
        }
        System.out.println("Count:"+ count);
    }
}
