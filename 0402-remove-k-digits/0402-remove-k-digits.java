class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()) return "0";
        StringBuilder st=new StringBuilder();
    for(char digit:num.toCharArray()){
        while (st.length() > 0 && k > 0 && st.charAt(st.length() - 1) > digit){
            st.deleteCharAt(st.length() - 1);
            k--;
        }
        st.append(digit);
    }
    st.setLength(st.length() - k);
        int start = 0;
        while (start < st.length() && st.charAt(start) == '0') {
            start++;
        }
         String result = st.substring(start);
        return result.isEmpty() ? "0" : result;
    }
}