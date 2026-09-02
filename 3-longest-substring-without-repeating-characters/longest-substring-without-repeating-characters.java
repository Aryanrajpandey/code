import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int charIndex[] = new int[128];
         int low = 0;
        int high;
        int maxlen = 0;
        for(high=0; high<s.length();high++){
            char ch = s.charAt(high);
            low = Math.max(low, charIndex[ch]);
            charIndex[ch]=high+1;
            maxlen=Math.max(maxlen,high-low+1);
        }
        return maxlen;
            

        
        
    }
}