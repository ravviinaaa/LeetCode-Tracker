// Last updated: 7/9/2026, 11:25:02 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int st=0;
        int m=n;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
            arr[i]=nums[st];
            st++;
            }
            else{
            arr[i]=nums[m];
            m++;
            }
        }
        return arr;
    }
}