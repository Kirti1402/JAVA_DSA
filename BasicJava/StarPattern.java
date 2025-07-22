public class StarPattern {
    public static void main(String[] args) {
        starPatternOne(4);
        rightAngledPattern(6);
        rightAngledNumberPattern(5);
        rightAngledNumberRepeatedPattern(4);
        rightAngledNumberReversedPattern(5);
        rightAngledRightAlignedPattern(5);
        rightAngledRightAlignedPattern(0);
        rightAngledTriangleofAlternating(6);
    }
    /*************************************************************************/
    public static void starPatternOne(int n1){
        System.out.println("Star Pattern One *********************************");
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledPattern(int n){
        System.out.println("Star Pattern: Right Angled *********************************");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledNumberPattern(int n){
        System.out.println("Pattern: Right Angled Number *********************************");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledNumberRepeatedPattern(int n){
        System.out.println("Pattern: Right Angled Repeated Number *********************************");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    /*************************************************************************/
    public static void rightAngledNumberReversedPattern(int n){
        System.out.println("Pattern: Right Angled Number Reverse *********************************");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
     /*************************************************************************/
    public static void rightAngledRightAlignedPattern(int n){
       
        if(n<=0){
            System.out.println("Number should be Greater than 0");
            return;
        }
         System.out.println("Star Pattern: Right Angled Right Aligned *********************************");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightAngledTriangleofAlternating(int n){
        if(n<=0){
            System.out.println("Number should be Greater than 0");
            return;
        }
         System.out.println("Right-Angled Triangle of Alternating 1s and 0s *********************************");
        
         for(int i=1;i<=n;i++){
            int k=0;
            for(int j=1;j<=i;j++){
                k = (k == 0) ? 1 : 0;
                System.out.print(k+" ");
            }
           
            System.out.println("");
         }
    }
}
