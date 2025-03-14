class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> uniqueNumbers = new HashSet<>();
        
        String[] parts = word.replaceAll("[a-z]", " ").trim().split("\\s+");
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                uniqueNumbers.add(part.replaceFirst("^0+", "")); // Remove leading zeros
            }
        }
        
        return uniqueNumbers.size();
    }
}