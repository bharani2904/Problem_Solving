class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int maxVowels=0;
        int currVowels=0;

        for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
            currVowels++;
        }
        }
        maxVowels=currVowels;
        
        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                currVowels++;
            }
            if(vowels.contains(s.charAt(i-k))){
                currVowels--;
            }
            maxVowels=Math.max(maxVowels,currVowels);
        }
        return maxVowels;
    }
}