class Operation {
    public static void main(String[] args) {
        System.out.println(Sum(5,6));
        System.out.println(Sub(5,6));
    }

    public static int Sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int Sub(int a, int b) {
      int sub = a - b;
      return sub;
   }
}