/*  Frederick Pierce
 */
import java.util.*;

public class QuestionB {
    
    public static String sortByString(String s, String t) {
        Map<Integer, String> cMap = new TreeMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            int key = t.indexOf(cs);
            if (!cMap.containsKey(key)) 
                cMap.put(key, String.valueOf(cs));
            else {
                String value = cMap.get(key);
                value = value.concat(String.valueOf(cs));
                cMap.put(key, value);
            }
        }
        Set<Map.Entry<Integer, String>> entrySet = cMap.entrySet();        
        String newString = "";
        for (Map.Entry<Integer, String> entry : entrySet) {
            newString += (entry.getValue());
        }   
        return newString;
    }
    public static void main(String[] args) {
        String s = "weather";
        String t = "therapyw";
        System.out.println(sortByString(s,t));
        s = "good"; 
        t = "odg";
        System.out.println(sortByString(s,t));
    }
}
