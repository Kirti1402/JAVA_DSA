public class LargestNumberInArray {
    public static void main(String[] args) {
        int numArr[] = {2,10,99,1,23,45,6,0};
        System.out.println(largestNumber(numArr));
    }

    public static int largestNumber(int arr[]){
        int max = arr[0];
        // int max = Integer.MIN_VALUE;
        for(int i =1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
