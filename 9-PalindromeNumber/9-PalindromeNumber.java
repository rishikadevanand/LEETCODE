// Last updated: 7/14/2026, 2:48:43 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
          while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == rev;
    }
}