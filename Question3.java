/*  Frederick Pierce */


public class GetClosingParen {
    
    public static int getClosingParen(String sentence, int openingParenIndex) {
        int xCount = 0;
        
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
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(getClosingParen("Sometimes (when I nest them (my parentheticals) too " +
                "much (like this (and this))) they get confusing.", 10));
    }
}
