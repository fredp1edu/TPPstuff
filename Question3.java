/*  Frederick Pierce */

public class Question3 {
    
    public static int getClosingParen(String sentence, int openingParenIndex) {
        int xCount = 0; int idx = 0;
        
        for (int j = openingParenIndex+1; j < sentence.length(); j++) {
            if (sentence.charAt(j) == '(') {
                xCount++;
            }
            else if(sentence.charAt(j) == ')') {
                if (xCount > 0)
                    xCount--;
                else 
                    return j;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        System.out.println(getClosingParen("Sometimes (when I nest them (my parentheticals) too " +
                "much (like this (and this))) they get confusing.", 10));
    }
}
