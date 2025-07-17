public class NegativeNumberInArray {
    public static void main(String[] args) {
        int numArr[] ={-2,5,-7,-12,12,34,-9,0};
        System.out.println(countNegativeNumberInArray(numArr));
    }
    public static int countNegativeNumberInArray(int arr[]){
        int count=0;
        /*In Java, local variables must be explicitly initialized before use. 
        Otherwise, you'll get a compilation error. */
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        return count;
    }
}
