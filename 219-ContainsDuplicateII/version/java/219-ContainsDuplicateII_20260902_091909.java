// Last updated: 9/2/2026, 9:19:09 AM
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public boolean containsNearbyDuplicate(int[] nums, int k) {
6        Set<Integer> set = new HashSet<>();
7        
8        for (int i = 0; i < nums.length; i++) {
9          
10            if (i > k) {
11                set.remove(nums[i - k - 1]);
12            }
13            
14            if (!set.add(nums[i])) {
15                return true;
16            }
17        }
18        
19        return false;
20    }
21}