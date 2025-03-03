class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder();
        String numStr=Integer.toString(n);
int c=0;


        for (int i = numStr.length() - 1; i >= 0; i--){
            sb.append(numStr.charAt(i));
            c++;
            if(c%3==0 && i!=0){
                sb.append('.');
            }
        }
        return sb.reverse().toString();
    }
}