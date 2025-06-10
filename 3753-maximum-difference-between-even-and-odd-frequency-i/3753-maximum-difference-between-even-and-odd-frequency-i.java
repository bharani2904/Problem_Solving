class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            int fi = freq[i];
            if (fi % 2 == 1) { 
                for (int j = 0; j < 26; j++) {
                    int fj = freq[j];
                    if (fj != 0 && fj % 2 == 0) { 
                        maxDiff = Math.max(maxDiff, fi - fj);
                    }
                }
            }
        }
return maxDiff;
    }
}