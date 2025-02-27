class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int [] arr=new int[n];
         for(int i=1;i<n;i+=2){
            arr[i-1]=nums[i];
            arr[i]=nums[i-1];
        }
        return arr;
    }
}