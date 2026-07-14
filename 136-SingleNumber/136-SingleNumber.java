// Last updated: 7/14/2026, 2:46:55 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int x:nums)
        {
            res ^= x;
        }
        return res;
        
    }
}