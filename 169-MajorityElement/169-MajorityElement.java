// Last updated: 7/9/2026, 11:26:15 AM
class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}