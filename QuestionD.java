import java.util.*;

public class StringPermutation {
    
    private final TreeSet<String> sTree = new TreeSet<>();      //tree sets simultaneously sort and prevent duplicates 
    
    public StringPermutation(String thing) {
        int lastIndex = thing.length() - 1;
        permute(thing, 0, lastIndex);
    }
    private void permute(String str, int startIndex, int endIndex) {
        if (startIndex == endIndex)
            sTree.add(str);
        else {
            for (int i = startIndex; i <= endIndex; i++) {
                str = swap(str, startIndex, i);             
                permute(str, startIndex+1, endIndex);      
            }
        }
    }
    public String swap(String a, int pos1, int pos2) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[pos1];
        charArray[pos1] = charArray[pos2];
        charArray[pos2] = temp;
        return String.valueOf(charArray);
    }
    public void showPerm() {
        System.out.println(sTree); 
    }
    public static void main(String[] args) {
        String[] s = {"CBA", "ABA", "AEFQ"};
        StringPermutation[] perm = new StringPermutation[s.length];
        for (int i = 0; i < s.length; i++) {
            perm[i] = new StringPermutation(s[i]);
            perm[i].showPerm();
        }
    }
}
