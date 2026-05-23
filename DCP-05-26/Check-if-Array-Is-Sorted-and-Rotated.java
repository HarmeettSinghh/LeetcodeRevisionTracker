1class Solution {
2    public boolean check(int[] arr) {
3        int n = arr.length;
4        int count =0;
5        for(int i =0; i<n; i++){
6            if(arr[i]>arr[(i+1)%n]){
7                count++;
8            }
9        }
10        return count<=1?true:false;
11    }
12}