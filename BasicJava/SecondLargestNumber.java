public class SecondLargestNumber {
    public static void main(String[] args) {
        int numArr[] = {3,10,2,88,45,17,19};
        int numArr2[] ={};
        int numArr3[] = {3,10};
        System.out.println("SecondLargestNumber:"+secondLargestNum(numArr)+" :END");
        System.out.println("SecondLargestNumber:"+secondLargestNum(numArr2)+ " :END");
        System.out.println("SecondLargestNumber:"+secondLargestNum(numArr3)+ " :END");
    }

    public static int secondLargestNum(int arr[]){
        if (arr == null || arr.length < 2) {
            System.out.println("Array is null, empty, or has less than two elements.");
            return -1;
        }
        int firstLargeNum=arr[0];
        int secondLargeNum=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(firstLargeNum < arr[i]){
                secondLargeNum = firstLargeNum;
                firstLargeNum = arr[i];
            }else if(secondLargeNum < arr[i] && arr[i] != firstLargeNum){
                secondLargeNum = arr[i];
            }
        }
         return (secondLargeNum == Integer.MIN_VALUE) ? -1 : secondLargeNum;
    }
}
