class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length, diff=0;
        for(int i=0;i<n;i++){
            int dr=Math.abs(nums[i]-nums[(i+1)%n]);
            diff=Math.max(dr,diff);
        }
        return diff;
    }
}