class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        ArrayList<Integer> specials = new ArrayList<>();

        for (int i=0; i<=right; i++) {
            char c = s.charAt(i);

            if (!Character.isLetterOrDigit(c))
                specials.add(i);
        }

        s = s.toLowerCase();

        while (left < right) {

            if (specials.contains(left)) {
                left++;
                continue;
            }
            
            if (specials.contains(right)) {
                right--;
                continue;
            }

            char cl = s.charAt(left);
            char cr = s.charAt(right);


            if (cl != cr)
                return false;

            left++;
            right--;
        }

        return true;
    }
}
