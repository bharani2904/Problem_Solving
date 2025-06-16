class Solution {
    public int maximumDifference(int[] nums) {
        int diff=-1,min=nums[0];
        for(int i=0;i<=nums.length-1;i++){
            if(min<nums[i]){
                diff=Math.max(diff,nums[i]-min);
            }
            else{
                min=nums[i];
            }
        }
        return diff;
    }
}