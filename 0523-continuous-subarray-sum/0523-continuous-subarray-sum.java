class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> remainderMap=new  HashMap<>();
        remainderMap.put(0, -1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remainder=sum%k;

            if(remainder<0){
                remainder+=k;
            }
            if(remainderMap.containsKey(remainder)){
                if(i-remainderMap.get(remainder)>1){
                    return true;
                }
            }
            else{
                remainderMap.put(remainder, i);
            }
        }
        return false;
    }
}