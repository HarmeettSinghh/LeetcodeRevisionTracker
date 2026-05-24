1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int size = m+n;
4        ArrayList<Integer> arr = new ArrayList<>();
5        int n1 = 0, n2=0;
6        while(n1<m && n2<n){
7            if(nums1[n1]<=nums2[n2]){
8                arr.add(nums1[n1]);
9                n1++;
10            }else{
11                arr.add(nums2[n2]);
12                n2++;
13            }
14        }
15        while(n1<m){
16            arr.add(nums1[n1]);
17            n1++;
18        }
19        while(n2<n){
20            arr.add(nums2[n2]);
21            n2++;
22        }
23        
24        for(int i=0; i<size; i++){
25            nums1[i]=arr.get(i);
26        }
27    }
28}