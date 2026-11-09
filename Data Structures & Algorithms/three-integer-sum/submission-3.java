class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();

        if (n < 3)
            return triplets;

        Arrays.sort(nums);

        for (int i=0; i<n; i++) {

            int left = i+1;
            int right = n-1;
            
            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    
                    ArrayList<Integer> triplet = new ArrayList<>();
                    
                    triplet.add(nums[i]);
                    triplet.add(nums[left]); 
                    triplet.add(nums[right]);
                    
                    if (!triplets.contains(triplet))
                        triplets.add(triplet);
                }

                if (sum < 0)
                    left++;

                else
                    right--;
            }
        }

        return triplets;
    }
}
