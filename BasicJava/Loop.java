public class Loop {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("Number:"+i);
        }
        int arrayNumber[] ={2,100,55,89,56,23,98,78};
        printAllEvenNumber(arrayNumber);
    }

    public static void printAllEvenNumber(int arr[]){
        for(int i =0;i<arr.length;i++){
            greet();
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }

    }
    public static void greet(){
        System.out.println("Greeting Function");
    }
}


/*
 * First intilization
 * Condition
 * update expression/step expression
 */