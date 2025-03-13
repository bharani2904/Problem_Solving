class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int index = 0;
        int[] result = new int[arr1.length];
        for (int num : arr2) {
            while (countMap.getOrDefault(num, 0) > 0) {
                result[index++] = num;
                countMap.put(num, countMap.get(num) - 1);
            }
            countMap.remove(num);
        }
        
        List<Integer> remaining = new ArrayList<>();
        for (int num : countMap.keySet()) {
            for (int i = 0; i < countMap.get(num); i++) {
                remaining.add(num);
            }
        }
        
        Collections.sort(remaining);
        for (int num : remaining) {
            result[index++] = num;
        }
        
        return result;
    }
}