class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0 ;
        List<Character> list = new ArrayList<Character>();
        int maxl = 0;

        while(end<s.length())
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                maxl = Math.max(maxl,list.size());
                end++;
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
    return   maxl;
    }
}