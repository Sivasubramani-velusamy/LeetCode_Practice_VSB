class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int operations = 0;
        boolean distinct = true;
        for (int i : map.values()) {
            if (i > 1) {
                distinct = false;
            }
        }
        while (!distinct) {
            list.subList(0, Math.min(3, list.size())).clear();
            operations++;
            HashMap<Integer, Integer> map1 = new HashMap<>();

            for (int i = 0; i < list.size(); i++) {
                map1.put(list.get(i), map1.getOrDefault(list.get(i), 0) + 1);
            }
            map.clear();
            map.putAll(map1);
            distinct = true;
            for (int i : map.values()) {
                if (i > 1) {
                    distinct = false;
                }
            }

        }
        return operations;
    }
}