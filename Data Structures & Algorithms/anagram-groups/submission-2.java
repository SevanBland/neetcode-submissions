class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            StringBuilder counts = new StringBuilder("00000000000000000000000000");
            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j) - 'a';
                counts.setCharAt(index, (char)(counts.charAt(index) + 1));
            }

            String key = counts.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}