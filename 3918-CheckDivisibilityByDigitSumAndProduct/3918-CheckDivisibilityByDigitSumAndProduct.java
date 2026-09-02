// Last updated: 9/2/2026, 9:12:38 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int sumDigit = 0;
        int productDigit = 1;
        int num = n;


        while (num > 0) {
            sumDigit += num % 10;
            productDigit *= num % 10;
            num /= 10;
        }


        return n % (sumDigit + productDigit) == 0;
    }
}