class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxVal=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    long v=(long)(nums[i]-nums[j])*nums[k];
                    if(v>maxVal){
                        maxVal=v;
                    }
                }
            }
        }
        return maxVal;
    }
}