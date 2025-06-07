class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> cntMap=new HashMap<>();
        for(int num:nums){
            cntMap.put(num,cntMap.getOrDefault(num,0)+1);
        }
        for(int f:cntMap.values()){
            if(f%2!=0){
                return false;
            }
        }
        return true;

    }
}