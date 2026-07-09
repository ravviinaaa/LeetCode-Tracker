// Last updated: 7/9/2026, 11:25:55 AM
class Solution {
    public boolean canWinNim(int n) {
    //if you get any non multiples of 4 number,then you will always win if you play optimally.
    
    return n%4!=0; 
    }
}