1class Solution {
2    public int totalFruit(int[] arr) {
3        int left=0,right=0,maxlen=0;
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for( right =0; right<arr.length; right++){
6            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
7            while(map.size()>2){
8                map.put(arr[left],map.get(arr[left])-1);
9                if(map.get(arr[left])==0){
10                    map.remove(arr[left]);
11                }
12                left++;
13            }
14            int len = right-left+1;
15            maxlen = Math.max(len,maxlen);
16            
17        }
18        return maxlen;
19    }
20}