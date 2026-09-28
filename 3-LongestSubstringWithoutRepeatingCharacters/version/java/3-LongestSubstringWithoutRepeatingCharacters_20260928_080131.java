// Last updated: 9/28/2026, 8:01:31 AM
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int lengthOfLongestSubstring(String s) {
6        int n = s.length();
7        int res = 0;
8        for (int i = 0; i < n; i++) {
9            Set<Character> charSet = new HashSet<>();
10            for (int j = i; j < n; j++) {
11                if (charSet.contains(s.charAt(j))) {
12                    break;
13                } else {
14                    charSet.add(s.charAt(j));
15                    res = Math.max(res, j - i + 1);
16                }
17            }
18        }
19        return res;
20    }
21}