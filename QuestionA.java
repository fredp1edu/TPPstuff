/*  Frederick Pierce
 */

public class QuestionA {
    
    public static int countways(int n) {
        if (n < 0)
        return 0;
    else if (n == 0)
        return 1;
    else
        return countways(n - 1) + countways(n - 2) + countways(n - 3);
    }
    public static void main(String[] args) {
        
        System.out.printf("%12s%18s\n%15s%18s\n", "#STEPS", "WAYS", "------------", "------------");
        for (int v = 2; v < 22; v+=2) {
            System.out.printf("%10d%,20d\n", v, countways(v));
        }
    }
}
