class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j];
            int i = map.getOrDefault(diff, -1);
            if (i != -1) {
                return new int[]{i, j};
            }
            map.put(nums[j], j);
        }
        return new int[]{-1, -1};
    }
}