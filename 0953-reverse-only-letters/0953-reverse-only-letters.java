public class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int lt = 0, rt = s.length() - 1;

        while (lt<rt) {
            if (!Character.isLetter(chars[lt])) {
                lt++;
            }
            else if (!Character.isLetter(chars[rt])) {
                rt--;
            }
            else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        return new String(chars);
    }
}
