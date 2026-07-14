// Last updated: 7/14/2026, 2:47:57 PM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1, b = 2;

        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
        }

        return b;
    }
}