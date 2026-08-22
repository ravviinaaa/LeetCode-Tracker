// Last updated: 8/22/2026, 2:02:52 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sumDigit = 0;
4        int productDigit = 1;
5        int num = n;
6
7
8        while (num > 0) {
9            sumDigit += num % 10;
10            productDigit *= num % 10;
11            num /= 10;
12        }
13
14
15        return n % (sumDigit + productDigit) == 0;
16    }
17}