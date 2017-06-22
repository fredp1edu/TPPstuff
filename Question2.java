/* Frederick Pierce */

public class StringReformat {
    
    public static String stringReformatting(String oldString, int k) {
        String newString = "";
        int len, startNum;
        oldString = oldString.replace("-", "");
        len = oldString.length();
        startNum = len % k;
        if (startNum > 0) {
            for  (int i = 0; i < startNum; i++) {
                newString += oldString.charAt(i);
            }
            newString += "-";
        }
        for  (int i = startNum; i < len; i+=k) {
            for (int j = 0; j < k; j++) {
                newString += oldString.charAt(i+j);
            }
            newString += "-";
        }
        newString = newString.substring(0, newString.length()-1);
        return newString;
    }
    public static void main(String[] args) {
        System.out.println(stringReformatting("2-4a0r7-4k", 4));
        System.out.println(stringReformatting("2-4a0r7-4k", 3));
    }
}
