class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount=0;
        int curr=1;
        int i=0;
        while(missingCount<k){
            if (i<arr.length && arr[i]==curr){
                i++;
            }else{
                missingCount++;
                if(missingCount==k) {
                    return curr;
                }
            }
            curr++;
        }
        return -1;
    }
}