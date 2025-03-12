class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalNumbers = n * n;
        HashSet<Integer> seen = new HashSet<>();
        int repeated = -1, actualSum = 0;
        for (int[] row : grid) {
            for (int num : row) {
                if (seen.contains(num)) {
                    repeated = num;
                }
                seen.add(num);
                actualSum += num;
            }
        }

        int expectedSum = totalNumbers * (totalNumbers + 1) / 2;
        int missing = expectedSum - (actualSum - repeated);

        return new int[]{repeated, missing};
    }
}