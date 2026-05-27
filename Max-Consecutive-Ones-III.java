1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int r=0;
4        int l =0;
5        int len =0 , maxlen =0;
6        int zeroes =0;
7        while(r<nums.length){
8            if(nums[r]==0){
9                zeroes++;
10            }
11            while(zeroes>k){
12                if(nums[l]==0)zeroes--;
13                l++;
14            }
15            if(zeroes<=k){
16                len = r-l+1;
17                maxlen = Math.max(len,maxlen);
18
19            }
20            r++;
21        }
22        return maxlen;
23    }
24}