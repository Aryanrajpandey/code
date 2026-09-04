class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int low = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int high = 0; high < s.length(); high++) {

            freq[s.charAt(high) - 'A']++;

            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(high) - 'A']
            );

            int len = high - low + 1;
            int diff = len - maxFreq;

            if (diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
            }

            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}