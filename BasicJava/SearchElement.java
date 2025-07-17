/*Write a function that searches for an element in an array and return the index , if the element 
 * is not present than just return -1
 */
public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {2,9,16,14,7,15,25,12,17,1,6};
        int num = 2;
        System.out.println(searchElement(arr, num));

    }
    public static String searchElement(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                 return "index:" + i;

            }
        }
        return "Not found -1";
    }
}
