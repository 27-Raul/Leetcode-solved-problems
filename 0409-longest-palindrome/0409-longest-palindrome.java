class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int result = 0;
        boolean odd =false;

        for(int i = 0;i<128;i++)
        {
            // char ch = s.charAt(i);
            if(freq[i]%2==0)
            {
                result +=freq[i];
            }

            else
            {
                result +=freq[i] -1;
                odd = true;
            }
        }
        

        if(odd)
        {
            result += 1;
        }
        return result;
    }
}