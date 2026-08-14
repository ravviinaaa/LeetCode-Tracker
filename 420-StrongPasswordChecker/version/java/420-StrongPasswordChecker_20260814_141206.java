// Last updated: 8/14/2026, 2:12:06 PM
1public class Solution {
2    public int strongPasswordChecker(String s) {
3        
4        if(s.length()<2) return 6-s.length();
5        
6        //Initialize the states, including current ending character(end), existence of lowercase letter(lower), uppercase letter(upper), digit(digit) and number of replicates for ending character(end_rep)
7        char end = s.charAt(0);
8        boolean upper = end>='A'&&end<='Z', lower = end>='a'&&end<='z', digit = end>='0'&&end<='9';
9        
10        //Also initialize the number of modification for repeated characters, total number needed for eliminate all consequnce 3 same character by replacement(change), and potential maximun operation of deleting characters(delete). Note delete[0] means maximum number of reduce 1 replacement operation by 1 deletion operation, delete[1] means maximun number of reduce 1 replacement by 2 deletion operation, delete[2] is no use here. 
11        int end_rep = 1, change = 0;
12        int[] delete = new int[3];
13        
14        for(int i = 1;i<s.length();++i){
15            if(s.charAt(i)==end) ++end_rep;
16            else{
17                change+=end_rep/3;
18                if(end_rep/3>0) ++delete[end_rep%3];
19                //updating the states
20                end = s.charAt(i);
21                upper = upper||end>='A'&&end<='Z';
22                lower = lower||end>='a'&&end<='z';
23                digit = digit||end>='0'&&end<='9';
24                end_rep = 1;
25            }
26        }
27        change+=end_rep/3;
28        if(end_rep/3>0) ++delete[end_rep%3];
29        
30        //The number of replcement needed for missing of specific character(lower/upper/digit)
31        int check_req = (upper?0:1)+(lower?0:1)+(digit?0:1);
32        
33        if(s.length()>20){
34            int del = s.length()-20;
35            
36            //Reduce the number of replacement operation by deletion
37            if(del<=delete[0]) change-=del;
38            else if(del-delete[0]<=2*delete[1]) change-=delete[0]+(del-delete[0])/2;
39            else change-=delete[0]+delete[1]+(del-delete[0]-2*delete[1])/3;
40            
41            return del+Math.max(check_req,change);
42        }
43        else return Math.max(6-s.length(), Math.max(check_req, change));
44    }
45}