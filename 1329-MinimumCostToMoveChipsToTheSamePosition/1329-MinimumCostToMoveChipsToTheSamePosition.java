// Last updated: 7/9/2026, 11:25:07 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd=0,even=0;
        for(int i:position){
            if(i%2==0)
            even++;
            else
            odd++;
        }
        return Math.min(odd,even);
    }
}