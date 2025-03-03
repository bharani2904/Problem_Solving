class Solution {
    public int smallestEvenMultiple(int n) {
        int m=n;
        while(m%2!=0){
            m+=n;
        }
        return m;
    }
}