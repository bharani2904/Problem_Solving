class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int[] freq=new int[3];
        int lt=0;
        for(int rt=0;rt<s.length();rt++){
            freq[s.charAt(rt)-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                c+=s.length()-rt;
                freq[s.charAt(lt)-'a']--;
                lt++;
            }
        }
        return c;
    }
}