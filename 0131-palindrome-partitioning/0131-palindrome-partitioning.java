class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<List<String>> ans=new ArrayList<>();

        boolean[][] dp=new boolean[n][n];
        for(int end=0;end<n;end++){
            for(int st=0;st<=end;st++){
                if(s.charAt(st)==s.charAt(end) && (end-st<=2||dp[st+1][end-1])){
                    dp[st][end]=true;
                }
            }
        }

        backtrack(0,s,dp,new ArrayList<>(),ans);
        return ans;
    }

    private void backtrack(int st, String s, boolean[][] dp, List<String> currList, List<List<String>> ans){
        if(st==s.length()){
            ans.add(new ArrayList<>(currList));
            return;
        }
        for(int end=st;end<s.length();end++){
            if(dp[st][end]){
                currList.add(s.substring(st,end+1));
                backtrack(end+1,s,dp,currList,ans);
                currList.remove(currList.size()-1);
            }
        }
    }
}