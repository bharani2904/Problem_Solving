class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer>freqMap=new HashMap<>();
        for(String word:words){
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            if (freqMap.get(w1).equals(freqMap.get(w2))) {
                return w1.compareTo(w2); 
            }
            return freqMap.get(w2) - freqMap.get(w1); 
        });
        heap.addAll(freqMap.keySet());

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(heap.poll());
        }

        return result;
    }
}