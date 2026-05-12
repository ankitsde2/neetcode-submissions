class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> li = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            li.add(entry);
        }
        Collections.sort(li, (a, b) -> b.getValue() - a.getValue());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = li.get(i).getKey();
        }
        return result;
    }
}
