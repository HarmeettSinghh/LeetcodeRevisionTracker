1class Solution {
2    public int maxScore(int[] arr, int k) {
3        int totalsum =0;
4        int n = arr.length;
5        
6        for(int i =0; i<arr.length; i++){
7            totalsum +=arr[i];
8        }
9        //calculating minimum window and subtracting it from the total sum
10        int windowsize = n-k;
11        int windowsum =0;
12        for(int i =0; i<windowsize; i++){
13            windowsum +=arr[i];
14        }
15        int minsum =windowsum; //storing the first windowsum
16        for(int i = windowsize; i<n; i++ ){
17            windowsum+=arr[i];
18            windowsum-=arr[i-windowsize];
19            minsum = Math.min(minsum, windowsum);
20
21        }
22        return totalsum-minsum;
23    }
24}