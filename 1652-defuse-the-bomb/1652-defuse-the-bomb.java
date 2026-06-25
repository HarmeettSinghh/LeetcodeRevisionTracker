class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[]  arr = new int[n];
        int start =0, end = 0;
        int sum =0;
        if(k==0){
            for(int i =0; i<n; i++){
            arr[i] =0;
    
           }
           return arr;
        }
        else if(k>0){
            start = 1;
            end =k;

        }
        else{
            k=-k;
            start = n-k;
            end = n-1;
            

        }
        //calculating the sum of the first window
        for(int i = start; i<=end; i++){
            sum+=code[i%n];
        }
        for(int i =0; i<n; i++){
            arr[i] = sum;
            sum-=code[start%n];
            start++;
            end++;
            sum+=code[end%n];

        }
        return arr;
    }
}