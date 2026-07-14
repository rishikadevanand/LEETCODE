// Last updated: 7/14/2026, 2:45:56 PM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {

            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}