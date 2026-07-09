// Last updated: 7/9/2026, 11:26:37 AM
class Solution {
    public int mySqrt(int x) {

        int ans = 0;

        for(long i = 1; i <= x; i++)
        {
            if(i * i <= x)
            {
                ans = (int)i;
            }
            else
            {
                break;
            }
        }

        return ans;
    }
}