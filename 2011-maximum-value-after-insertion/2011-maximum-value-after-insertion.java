class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb=new StringBuilder();
        int len=n.length();
        boolean insert=false;

         if (n.charAt(0) == '-') {
            sb.append('-');
            for (int i = 1; i < len; i++) {
                if (!insert && x < (n.charAt(i) - '0')) {
                    sb.append(x);
                    insert = true;
                }
                sb.append(n.charAt(i));
            }
        }else{
            for (int i = 0; i < len; i++) {
                if (!insert && x > (n.charAt(i) - '0')) {
                    sb.append(x);
                    insert = true;
                }
                sb.append(n.charAt(i));
            }
        }
        if (!insert) {
            sb.append(x);
        }
        
        return sb.toString();
    }
}