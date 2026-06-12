class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        if (n<=1)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int x : nums) {
            if (set.contains(x))
                return true;
            
            set.add(x);
        }

        return false;
    }
}