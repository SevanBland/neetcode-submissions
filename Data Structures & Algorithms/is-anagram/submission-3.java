class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char l : t.toCharArray()) {
            // int count = counts[l - 'a']--;
            if (--counts[l - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}