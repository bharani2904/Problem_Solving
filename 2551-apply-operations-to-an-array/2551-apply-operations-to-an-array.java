class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] ans=new int[n];
        int idx=0;

        for(int num:nums){
            if(num!=0){
                ans[idx++]=num;
            }
        }
        return ans;
            }
}