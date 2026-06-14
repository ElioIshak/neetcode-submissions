class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if (n<2)
            return n;

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i=0; i<n; i++) 
            map.put(nums[i], 0);

        for (int key : map.keySet())
            map.put(key, map.getOrDefault(key-1, 0) + 1);
            
        int longest = 0;

        for (int key : map.keySet())
            longest = Math.max(longest, map.get(key));

        return longest;
    }
}
