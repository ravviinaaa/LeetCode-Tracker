// Last updated: 8/24/2026, 11:21:39 AM
1class Solution {
2    public int[] constructTransformedArray(int[] A) {
3        int n = A.length;
4        int OFFSET = 1 << 7;
5        int MASK = (1 << 8) - 1;
6
7        for (int i = 0; i < n; i++)
8            A[i] += OFFSET;
9
10        for (int i = 0; i < n; i++) {
11            int cur = A[i] - OFFSET;
12            int idx = ((i + cur) % n + n) % n;
13            int val = A[idx] & MASK;
14            A[i] |= val << 8;
15        }
16
17        for (int i = 0; i < n; i++)
18            A[i] = (A[i] >> 8) - OFFSET;
19
20        return A;
21    }
22}
23