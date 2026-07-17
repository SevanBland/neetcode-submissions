class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            StringBuilder counts = new StringBuilder("00000000000000000000000000");
            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j) - 'a';
                counts.setCharAt(index, (char)(counts.charAt(index) + 1));
            }

            String key = counts.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        
        groups.addAll(map.values());
        return groups;
    }
}