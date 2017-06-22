/* Frederick Pierce */
public class Question1 {
    
    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] intArrayA = {8, 7, 18, 12};
        int[] intArrayB = {6, 22, 40, 9, 3, 8};
        int target = 10;
        
        if (sumOfTwo(intArrayA, intArrayB, target))
            System.out.println("true");
        else 
            System.out.println("false");    
    }
    /* changed the 3 to 4 in intArrayB to get a false reading */
}
