1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int n = word.length();
4        int count =0;
5        boolean[] visited = new boolean[26];
6        for(int i =0; i<n; i++){
7            char ch = word.charAt(i);
8            
9            if(ch>=97 && ch<=122){
10                if(visited[ch-'a']){
11                continue;
12            }
13                for(int j =0; j<n; j++){
14                    if(word.charAt(j) == ch-32){
15                        count++;
16                        visited[ch-'a'] =true;
17                        break;
18                    }
19                }
20            }
21        }
22        return count;
23    }
24}