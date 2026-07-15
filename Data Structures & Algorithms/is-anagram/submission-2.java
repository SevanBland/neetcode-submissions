class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }
            else {
                map.replace(c, map.get(c) + 1);
            }
        }

        for (char l : t.toCharArray()) {
            if (map.containsKey(l)) {
                map.replace(l, map.get(l) - 1);
                map.remove(l, 0);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
