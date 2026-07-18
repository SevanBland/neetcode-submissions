class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (!freqMap.containsKey(num)) {
                freqMap.put(num, 1);
            }
            else {
                freqMap.replace(num, freqMap.get(num) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = list.get(i).getKey();
        }
        return topK;
    }
}
