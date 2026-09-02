// Last updated: 9/2/2026, 9:13:10 AM
class Solution {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }
}