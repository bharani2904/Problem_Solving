class Solution {
    public String robotWithString(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        char[]dp=new char[n];
        minchar(s,dp);
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&st.peek()<=dp[i]){
                sb.append(st.pop());
            }
            st.add(s.charAt(i));
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

    private void print(Stack<Character> s){
        for(char i:s){
            System.out.print(i);
        }
        System.out.println();
    }
    private void minchar(String s, char[] dp){
        int n=s.length();
        char min=s.charAt(n-1);
        dp[n-1]=min;
        for(int i=n-2;i>=0;i--){
            if(min>s.charAt(i)){
                min=s.charAt(i);
            }
            dp[i]=min;
        }
    }
}