class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>(); 

        String[] sorted = new String[n];

        for (int i=0; i<n; i++) {
            String s = strs[i];
            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            sorted[i] = new String(chars);
        }

        for (int i=0; i<n; i++) {
            if(map.containsKey(sorted[i])) {
                ArrayList<String> vals = map.get(sorted[i]);
                vals.add(strs[i]);
                map.put(sorted[i], vals);
            }
            else {
                ArrayList<String> vals = new ArrayList<String>();
                vals.add(strs[i]);
                map.put(sorted[i], vals);
            }
        }

        ArrayList<List<String>> grouped = new ArrayList<List<String>>();

        for (String anagram : map.keySet())
            grouped.add(map.get(anagram));

        return grouped;
    }
}
