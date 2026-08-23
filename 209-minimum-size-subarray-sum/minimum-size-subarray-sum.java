class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int high=0;
        int low=0;
        int sum=0;
        int n=arr.length;
        int res=Integer.MAX_VALUE;;
        while(high<n){
            sum+=arr[high];
            while(sum>=target){
                int len=high-low+1;
                sum=sum-arr[low];
                res=Math.min(res, len);
                low++;
            }
            high++;
        }
        if(res==Integer.MAX_VALUE)
         return 0;
        return res;
        
    }
}