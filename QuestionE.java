//Frederick Pierce
import java.util.*;

public class DecodeString {
    
    public static String decodeString(String input) {
        Stack<Character> inList = new Stack<>();
        Queue<Integer> opList = new LinkedList<>();
        Queue<String> chList = new LinkedList<>();
        String tempString = "";
        for (int i = 0; i < input.length(); i++) {
            inList.push(input.charAt(i));
        }
        while (!inList.isEmpty()) {
            char testChar = inList.pop();
            if (testChar == '[') {
                chList.add(tempString);
                tempString = "";
                int op = Character.getNumericValue(inList.pop());
                opList.add(op);
            } 
            else if (testChar != ']') {
                tempString = testChar + tempString;
            }
        }
        String output = "";
        while (!opList.isEmpty()) {
            output  = chList.poll() + output;
            int numTimes = opList.poll();
            String temp = output;
            for (int k = 1; k < numTimes; ++k) {
                output = temp + output;
            } 
        }
        return output;
    }
    public static void main(String[] args) {
        String tString[] = {"4[ab]", "2[b3[a]]", "2[e2[b3[a]]]"};
        for (String thing : tString)
            System.out.println(decodeString(thing));
    }
}
