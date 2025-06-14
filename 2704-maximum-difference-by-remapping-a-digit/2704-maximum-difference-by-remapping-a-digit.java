class Solution {
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        int maxVal=Integer.MIN_VALUE;
        for(char d='0';d<='9';d++){
            String replaced=s.replace(d,'9');
            maxVal=Math.max(maxVal,Integer.parseInt(replaced));
        }
        int minVal=Integer.MAX_VALUE;
         for (char d = '0'; d <= '9'; d++) {
            String replaced = s.replace(d, '0');
            minVal = Math.min(minVal, Integer.parseInt(replaced));
        }
        return maxVal-minVal;
    }
}