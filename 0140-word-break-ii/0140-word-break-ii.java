class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet=new HashSet<>(wordDict);
        Map<String, List<String>> map=new HashMap<>();
        return dfs(s,wordSet,map);
    }

    private List<String> dfs(String s,Set<String> wordSet, Map<String, List<String>>map){
        if(map.containsKey(s)) return map.get(s);

        List<String> ans=new ArrayList<>();
        if(s.length()==0){
            ans.add("");
           return ans;
        }
        for(int e=1;e<=s.length();e++){
            String pre=s.substring(0,e);
             if (wordSet.contains(pre)) {
                List<String> suffixBreaks = dfs(s.substring(e), wordSet, map);
                for (String sentence : suffixBreaks) {
                    ans.add(pre + (sentence.isEmpty() ? "" : " " + sentence));
                }
            }
        }
map.put(s, ans);
        return ans;

    }
}