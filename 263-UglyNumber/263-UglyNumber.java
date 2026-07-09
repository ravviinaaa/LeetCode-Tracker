// Last updated: 7/9/2026, 11:25:59 AM
class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;

        n = uglyChecker(n, 2);
        n = uglyChecker(n, 3);
        n = uglyChecker(n, 5);

        return n == 1;
    }

    public int uglyChecker(int num, int factor){
        while(num % factor == 0){
            num /= factor;
        }

        return num;
    }
}