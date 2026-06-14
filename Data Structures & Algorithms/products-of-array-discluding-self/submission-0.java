class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int nonZero = 1;
        int zeroCount = 0;

        for (int i=0; i<n; i++) {
            product *= nums[i];
            if (nums[i]!=0)
                nonZero *= nums[i];
            if (nums[i]==0)
                zeroCount++;
        }

        int[] output = new int[n];

        if (zeroCount>1)
            for (int i=0; i<n; i++)
                output[i] = 0;
            
        else
            for (int i=0; i<n; i++)
                if (nums[i]!=0)
                    output[i] = product / nums[i];
                else
                    output[i] = nonZero;

        return output;
    }
}  
