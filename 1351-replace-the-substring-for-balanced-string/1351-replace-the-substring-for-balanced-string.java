class Solution {
    public int balancedString(String s) {
        int n=s.length();
        int r=n/4;
        Map<Character, Integer>count=new HashMap<>();
        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        if(isBalanced(count,r)) return 0;

        int minLen=n,left=0;
        for(int right=0;right<n;right++) {
            count.put(s.charAt(right),count.get(s.charAt(right))-1);
            while(isBalanced(count,r)) {
                minLen=Math.min(minLen,right-left+1);
                count.put(s.charAt(left),count.get(s.charAt(left))+1);
                left++;
            }
        }
        return minLen;
    }
    private boolean isBalanced(Map<Character,Integer>count,int r) {
        return count.getOrDefault('Q',0) <= r &&
               count.getOrDefault('W',0) <= r &&
               count.getOrDefault('E',0) <= r &&
               count.getOrDefault('R',0) <= r;
    }
}