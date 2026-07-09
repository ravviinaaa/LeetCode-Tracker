// Last updated: 7/9/2026, 11:26:58 AM
class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = getValue(s.charAt(i));

            if (i < s.length() - 1) {

                int next = getValue(s.charAt(i + 1));

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }

            } else {
                total += current;
            }
        }

        return total;
    }

    public int getValue(char c) {

        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}