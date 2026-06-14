class Solution {

    public String encode(List<String> strs) {
        String str = "";

        for (String s : strs)
            str += s + "#@";

        return str;
    }

    public List<String> decode(String str) {
        int n = str.length();
        ArrayList<String> list = new ArrayList<String>();

        StringBuilder s = new StringBuilder();

        for (int i=0; i<n; i++) {
            char c = str.charAt(i);

            if (c == '#' && i<n-1 && str.charAt(i+1) == '@') {
                list.add(s.toString());
                s = new StringBuilder();
                i++;
                continue;
            }
            
            s.append(c);
        }

        return list;
    }
}
