class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] indices = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<n; i++) {
            int curr = nums[i];

            int missing = target - curr;

            if (map.containsKey(missing)) {
                indices[0] = i;
                indices[1] = map.get(missing);
                Arrays.sort(indices);

                break;
            }

            map.put(curr, i);
        }

        return indices;
    }
}
