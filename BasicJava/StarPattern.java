public class StarPattern {
    public static void main(String[] args) {
        starPatternOne(4);
        rightAngledPattern(6);
        rightAngledNumberPattern(5);
        rightAngledNumberRepeatedPattern(4);
    }
    /*************************************************************************/
    public static void starPatternOne(int n1){
        System.out.println("Star Pattern One");
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledNumberPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledNumberRepeatedPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
