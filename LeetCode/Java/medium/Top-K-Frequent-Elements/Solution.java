class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];

        for (int key : map.keySet()) {
            int frequency = map.get(key);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for (int frequency = bucket.length - 1; frequency >= 0; frequency--) {
            if (bucket[frequency] != null) {
                for (int num : bucket[frequency]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }

}
