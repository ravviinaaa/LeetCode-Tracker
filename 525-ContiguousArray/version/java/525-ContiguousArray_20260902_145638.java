// Last updated: 9/2/2026, 2:56:38 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length;
4        Map<Integer, Integer> mp = new HashMap<>();
5        int sum = 0;
6        int subArrayLength = 0;
7        for (int i = 0; i < n; i++) {
8            sum += nums[i] == 0 ? -1 : 1;
9            if (sum == 0) {
10                subArrayLength = i + 1;
11            } else if (mp.containsKey(sum)) {
12                subArrayLength = Math.max(subArrayLength, i - mp.get(sum));
13            } else {
14                mp.put(sum, i);
15            }
16        }
17        return subArrayLength;
18    }
19}