class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int countEven=0;
        for(int num:nums){
            if((num&1)==0){
                countEven++;
            }
            if(countEven>=2){
                return true;
            }
        }
        return false;
    }
}