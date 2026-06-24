class Solution {
    public int totalFruit(int[] arr) {
        int right =0;
        int left =0;
        int maxlen =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(right =0; right<arr.length; right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            
            }
            int len = right-left+1;
            maxlen = Math.max(len,maxlen);
        }
        return maxlen;

    }
}