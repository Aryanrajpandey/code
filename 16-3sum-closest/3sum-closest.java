class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        int result = target;
        Arrays.sort(arr);
        int md = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[r] + arr[l];
                int diff = Math.abs(sum - target);
                if (md > diff) {
                    md = diff;
                    result = sum;
                }
                if (sum == target)
                    return sum;
                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
            }

        }
        return result;

    }
}