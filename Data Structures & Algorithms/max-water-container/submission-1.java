class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        if (n <=1)
            return 0;

        int max = 0;

        int left = 0;
        int right = n-1;

        while(left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;

            max = Math.max(max, height * width);

            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }   

        return max;
    }
}
