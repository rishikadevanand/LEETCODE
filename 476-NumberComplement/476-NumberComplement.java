// Last updated: 7/14/2026, 2:44:44 PM
class Solution {
    public int findComplement(int num) {
        int n =0;
        while(n<num)
          n = (n<<1) | 1;
        return n-num;
    }
}