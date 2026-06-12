class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int[] result = new int[k];
        int index = 0;

        for (int n : nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        TreeMap<Integer, ArrayList<Integer>> top = new TreeMap<Integer, ArrayList<Integer>>(Collections.reverseOrder());

        for (int key : freq.keySet()) {
            if (top.containsKey(freq.get(key))) {
                ArrayList<Integer> vals = new ArrayList<Integer>();
                vals = top.get(freq.get(key));
                vals.add(key);
                top.put(freq.get(key), vals);
            }
            else {
                ArrayList<Integer> vals = new ArrayList<Integer>();
                vals.add(key);
                top.put(freq.get(key), vals);
            }
        }

        for (int f : top.keySet()) {
            ArrayList<Integer> list = top.get(f);

            for (int x : list) {
                if (index==k)
                    return result;

                result[index++] = x;
            }
        }

        return result;
    }
}
