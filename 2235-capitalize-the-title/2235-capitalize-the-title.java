class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder ans=new StringBuilder();

        for(String word:words){
            if(word.length()<=2){
                ans.append(word.toLowerCase());
            } else{
                ans.append(Character.toUpperCase(word.charAt(0)));
                ans.append(word.substring(1).toLowerCase());
            }
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}