public class SmallestNumberInArray {
    public static void main(String[] args) {
        int numArr[]={-1,0,-5,8,9,10,-15};
        System.out.println(smallestNumber(numArr));
    }
    public static int smallestNumber(int arr[]){
        int smallest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest= arr[i];
            }
        }
        return smallest;
    }
}
