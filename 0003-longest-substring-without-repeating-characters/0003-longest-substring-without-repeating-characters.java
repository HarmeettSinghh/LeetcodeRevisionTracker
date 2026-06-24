class Solution {
    public int lengthOfLongestSubstring(String s) {
         int right =0;
         int left =0;
         HashMap<Character,Integer> map = new HashMap<>();
         int n = s.length();
         int maxLength =0;
         for( right =0; right<n; right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch) + 1);
            }
            int length = right-left+1;
            maxLength = Math.max(maxLength,length);
            map.put(ch , right);
         }
         return maxLength;
    }
}