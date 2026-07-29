// Last updated: 7/29/2026, 4:01:14 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int pivot = -1;
5        int len = nums.length;
6
7        for (int i = len - 2; i >= 0; i--) {
8            if (nums[i] < nums[i + 1]) {
9                pivot = i;
10                break;
11            }
12        }
13
14        if (pivot == -1) {
15            reverse(nums, 0, len - 1);
16            return;
17        }
18
19        for (int i = len - 1; i > pivot; i--) {
20            if (nums[pivot] < nums[i]) {
21                swap(nums, pivot, i);
22                break;
23            }
24        }
25
26        reverse(nums, pivot + 1, len - 1);
27    }
28
29    private void reverse(int[] nums, int start, int end) {
30        while (start < end) {
31            swap(nums, start, end);
32            start++;
33            end--;
34        }
35    }
36
37    private void swap(int[] arr, int a, int b) {
38        int temp = arr[a];
39        arr[a] = arr[b];
40        arr[b] = temp;
41    }
42}