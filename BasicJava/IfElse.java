public class IfElse {
    public static void main(String[] args) {
        voteCheck(4);
        voteCheck(19);
        voteCheck(-8);
    }

    public static void voteCheck(int age){
        if(age > 18){
            System.out.println("Eligible to vote");
        } else if(age <=0) {
            System.out.println("Not valid age");
        }else {
            System.out.println("Not eligible to vote");
        }
    }
}
