1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int[] ca = new int[26];
4        int[] sa = new int[26];
5        Arrays.fill(ca,-1);
6        Arrays.fill(sa,-1);
7        int n = word.length();
8        for(int i=0; i<n; i++){
9            char ch = word.charAt(i);
10            if(ch>='A' && ch <='Z'){
11               if(ca[(int)ch-65]==-1){
12                    ca[(int)ch-65] = i; //we only want the first uppercase index
13               }
14            }else if(ch>='a' && ch<= 'z'){
15                sa[(int)ch - 97] = i; //we want the last lowercase index
16            }
17        }
18        int count =0;
19        for(int i =0; i<ca.length; i++){
20            if(ca[i]!=-1 && sa[i]!=-1 && sa[i]<ca[i]){
21                count++;
22            }
23        }
24        return count;
25    }
26}