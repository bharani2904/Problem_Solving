public class Solution {
    public int findKthNumber(int n, int k) {
        int current = 1;
        k--; 
        while (k > 0) {
            long count = getCount(n, current, current + 1);
            if (count <= k) {
                k -= count;
                current++; 
            } else {
                current *= 10; 
                k--;
            }
        }

        return current;
    }

    
    private long getCount(int n, long prefix, long nextPrefix) {
        long count = 0;
        while (prefix <= n) {
            count += Math.min(n + 1, nextPrefix) - prefix;
            prefix *= 10;
            nextPrefix *= 10;
        }
        return count;
    }
}
