public class StarPattern {
    public static void main(String[] args) {
        starPatternOne(4, 4);
    }
    public static void starPatternOne(int n1,int n2){
        System.out.println("Star Pattern One");
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
