class Solution {
    public int longestSubarray(int[] nums) {
       int countZeroes = 0;
       int n = nums.length;
       int r =0;
       int l =0;
       int maxlen =0;
       for(r=0;r<n; r++){
            if(nums[r]==0){
                countZeroes++;
            }
            while(countZeroes>1){
                if(nums[l]==0){
                    countZeroes--;
                }
                l++;
            }
            int len = r-l;
            maxlen = Math.max(len,maxlen);
       }
       return maxlen;
    }
}