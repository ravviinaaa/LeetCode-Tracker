// Last updated: 8/24/2026, 11:27:32 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3
4        int ans[] = new int[nums.length * 2];
5
6        for (int i = 0; i < ans.length; i++) {
7            ans[i] = nums[i % nums.length];
8        }
9
10        return ans;
11    }
12}