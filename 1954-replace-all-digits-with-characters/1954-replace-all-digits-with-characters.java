class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder(s.length());

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(s.charAt(i));
            }
            else{
                char shiftedChar = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
                sb.append(shiftedChar);
            }
        }
        return sb.toString();
    }
}