class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[]freq = new int[3];
        int left =0;
        int right =0;
        int total =0;
        while(right<n){
            char ch = s.charAt(right);
            freq[ch-'a']++;
            while(checkChar(freq)){
                total+=(n-right);
                char leftChar = s.charAt(left);
                freq[leftChar - 'a']--;
                left++;
            }
            right++;
        }
        return total;
    }
    public boolean checkChar(int[] freq){
        return (freq[0]>0 && freq[1]>0 && freq[2]>0);
    }
}