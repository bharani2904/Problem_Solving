import java.util.*;

public class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int n = nums.length;
        List<Integer> lt=new ArrayList<>();
        List<Integer> rt=new ArrayList<>();
        generateSubsetSums(nums, 0, n/2, 0, lt);
        generateSubsetSums(nums, n/2, n, 0, rt);
        Collections.sort(rt);

        int minDiff=Integer.MAX_VALUE;
        for (int l:lt) {
            int com=goal-l;
            int idx=Collections.binarySearch(rt, com);
            if (idx>=0) {
                return 0; 
            } else {
                idx=-idx-1;
                if (idx<rt.size()) {
                    minDiff = Math.min(minDiff, Math.abs(l+rt.get(idx)-goal));
                }
                if (idx>0) {
                    minDiff = Math.min(minDiff, Math.abs(l+rt.get(idx-1)-goal));
                }
            }
        }
        return minDiff;
    }
    private void generateSubsetSums(int[] nums, int st, int end, int sum, List<Integer> res) {
        if (st==end) {
            res.add(sum);
            return;
        }
        generateSubsetSums(nums, st+1, end, sum+nums[st], res);
        generateSubsetSums(nums, st+1, end, sum, res);
    }
}
