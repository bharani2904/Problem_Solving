class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> map1 = new HashMap<>(); 
        HashMap<Integer, Integer> map2 = new HashMap<>(); 

        int[] ans = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int x = queries[i][0];
            int y = queries[i][1];

            if(map2.containsKey(x)){
                int prevColor = map2.get(x);

                map1.put(prevColor, map1.get(prevColor)-1);

                map2.put(x,y);
                map1.put(y, map1.getOrDefault(y,0)+1);

                if(map1.get(prevColor)<=0){
                    map1.remove(prevColor);
                }
            } else {
                map2.put(x,y);
                map1.put(y, map1.getOrDefault(y,0)+1);
            }

            ans[i] = map1.size();
        }

        return ans;
    }
}