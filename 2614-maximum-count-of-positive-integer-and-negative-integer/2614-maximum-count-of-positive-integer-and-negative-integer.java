class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;

        int lt=0,rt=n;
        while(lt<rt){
            int mid=(lt+rt)/2;
            if(nums[mid]<=0){
                lt=mid+1;
            }else{
                rt=mid;
            }
        }
        int positives=n-lt;

        lt=0;
        rt=n;
        while(lt<rt){
            int mid=(lt+rt)/2;
            if(nums[mid]<0){
                lt=mid+1;
            }else{
                rt=mid;
            }
        }
        int negatives=lt;
        return Math.max(positives, negatives);
    }
}