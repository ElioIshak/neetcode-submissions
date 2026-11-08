class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if (n <=1)
            return n;

        HashSet<Character> set = new HashSet<>();

        int max = 1;
        int left = 0;
        
        for (int right=left; right<n; right++) {
            char r = s.charAt(right);

            if (set.contains(r)) {
                while (left<right) {
                    char curr = s.charAt(left);
                    left++;
                    set.remove(curr);

                    if (curr == r)
                        break;
                }
            }
                set.add(r);

                max = Math.max(max, right - left + 1);
        }

        return max;
      }
}
