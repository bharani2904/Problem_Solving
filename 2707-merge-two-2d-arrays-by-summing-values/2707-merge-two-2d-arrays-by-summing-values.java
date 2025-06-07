class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int[] pair:nums1){
            map.put(pair[0], map.getOrDefault(pair[0],0)+pair[1]);
        }
        for(int[] pair:nums2){
            map.put(pair[0], map.getOrDefault(pair[0],0)+pair[1]);
        }

        int[][] ans=new int[map.size()][2];
        int idx=0;
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            ans[idx][0]=entry.getKey();
            ans[idx][1]=entry.getValue();
            idx++;
        }
        return ans;
    }
}