class Solution {
    public String clearStars(String s) {
        
        TreeMap<Character, TreeSet<Integer>> map=new TreeMap<>();
        int idx=0;
        Set<Integer> removedIdxs=new HashSet<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                char ch=map.firstKey();
                TreeSet<Integer> set=map.get(ch);
                int x=set.first();
                removedIdxs.add(x);
                set.remove(x);
                if(set.size()==0)
                map.remove(ch);
            }
            else
            {
                map.putIfAbsent(c, new TreeSet<>(Collections.reverseOrder()));
                map.get(c).add(idx);
            }
            idx++;
        } 
        StringBuilder sb=new StringBuilder();
        idx=0;
        for(char c:s.toCharArray()){
            if(c!='*' && !removedIdxs.contains(idx))
            sb.append(c);
            idx++;
        }
        return sb.toString();
    }
}