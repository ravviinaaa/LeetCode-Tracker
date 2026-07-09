// Last updated: 7/9/2026, 11:24:52 AM
class Solution {
    public int numberOfCuts(int n) {
      if(n==1)return 0;
      if(n%2==0)return n/2;
      return n;  
    }
}