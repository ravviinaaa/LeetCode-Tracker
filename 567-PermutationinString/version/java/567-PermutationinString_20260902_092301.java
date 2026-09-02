// Last updated: 9/2/2026, 9:23:01 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n1 = s1.length();
4        int n2 = s2.length();
5
6        if(n2 < n1) return false;
7
8        int[] count1 = new int[26];
9        int[] count2 = new int[26];
10
11        for(int i = 0; i < n1; i++){
12            count1[s1.charAt(i) - 'a']++;
13            count2[s2.charAt(i) - 'a']++;
14        }
15
16        if(Arrays.equals(count1, count2)) return true;
17
18        for(int i = n1; i < n2; i++){
19            count2[s2.charAt(i) - 'a']++;                 
20            count2[s2.charAt(i - n1) - 'a']--;          
21
22            if(Arrays.equals(count1, count2)) return true;
23        }
24
25        return false;
26    }
27}