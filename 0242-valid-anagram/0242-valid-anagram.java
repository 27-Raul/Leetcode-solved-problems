class Solution {
    public boolean isAnagram(String s, String t) {
        int count[] =  new int[26];

        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            count[ch-97]++;
        }

        int count1[] =  new int[26];

        for(int i = 0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            count1[ch-97]++;
        }

        return Arrays.equals(count,count1);
    }
}