//Frederick Pierce

import java.util.*;

public class ChangePossibilities {
    
    public static final int[] denom = {1, 2, 3};

    public static void change(int amount) { 
        change(amount, new ArrayList<>(), 0); 
    }
    static int r = 1;
    private static void change(int remaining, List<Integer> coins, int index) {
        if (remaining == 0) {
            System.out.println(coins);
        }
        else {
            if (remaining >= denom[index]) {
                coins.add(denom[index]);
                change(remaining - denom[index], coins, index);         //the initial recursion call runs 7-8 times
                coins.remove(coins.size() - 1);                         // this after-recusion function only runs twice, WHY?
            }
            if (index + 1 < denom.length)
                change(remaining, coins, index + 1);
        }
    }
    public static void main(String[] args) {
        change(6);
    }
}
    