class Solution {
    public String robotWithString(String s) {
        int n=s.length();
        int[] minCharSuffix=new int[n];

        minCharSuffix[n-1]=s.charAt(n-1);
        for(int i=n-2;i>=0;i--){
            minCharSuffix[i]=Math.min(s.charAt(i), minCharSuffix[i+1]);
        }

        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            st.push(c);

            while(!st.isEmpty() && st.peek()<=minCharSuffix[i==n-1 ? n-1 :i+1]){
                ans.append(st.pop());
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}