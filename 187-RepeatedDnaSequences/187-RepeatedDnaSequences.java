// Last updated: 7/14/2026, 2:46:16 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        if (n <= 10)
            return ans;
        Set<String> set = new HashSet<>();
        int i = 10;
        while (i <= n) {
            String t = s.substring(i - 10, i++);
            if (set.contains(t)) {
                if (!ans.contains(t))
                    ans.add(t);
            } else
                set.add(t);
        }
        return ans;
    }
}