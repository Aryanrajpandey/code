import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0, high = 0;
        int res = Integer.MIN_VALUE;
        HashMap<Character, Integer> f= new HashMap<>();

        for (high = 0; high < n; high++) {

            f.put(s.charAt(high), 
                  f.getOrDefault(s.charAt(high), 0) + 1);

            int len = high - low + 1;

            while (f.size() < len) {

                // Frequency decrease
                char ch = s.charAt(low);

                f.put(ch, f.get(ch) - 1);

                // If frequency becomes 0, remove it
                if (f.get(ch) == 0) {
                    f.remove(ch);
                }

                low++;
                len = high - low + 1;
            }

            // Current valid window length
            len = high - low + 1;

            res = Math.max(res, len);
        }

        if (res == Integer.MIN_VALUE)
            return 0;

        return res;
    }
}