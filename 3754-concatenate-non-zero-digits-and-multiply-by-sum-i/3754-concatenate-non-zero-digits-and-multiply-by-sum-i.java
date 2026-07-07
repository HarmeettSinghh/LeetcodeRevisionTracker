class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        int newn =0;
        while(n>0){
            int ld = n%10;
            if(ld!=0){
                sum+=ld;
                newn = newn*10 + ld;
            }
            n=n/10;
        }
        int rev =0;
        while(newn>0){
            int ld = newn%10;
            rev = rev*10 +ld;
            newn = newn/10;
        }
        return (long)rev*sum;
    }
}