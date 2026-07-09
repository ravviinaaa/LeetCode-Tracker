// Last updated: 7/9/2026, 11:24:46 AM
class Solution {
    public static boolean check(int data,int[] nums){
        for(int i:nums){
            if(data==i){
                return true;
            }
        }
            return false;
    }
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res=new int[2];
        int count=0,count2=0;
        for(int i=0;i<nums1.length;i++){
            if(check(nums1[i],nums2)){
                count++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(check(nums2[i],nums1)){
                count2++;
            }
        }
        res[0]=count;
        res[1]=count2;
        return res;
    }
}