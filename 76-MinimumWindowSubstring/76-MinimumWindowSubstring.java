// Last updated: 7/14/2026, 2:47:52 PM
class Solution {
    public String minWindow(String s, String t) {
        int[] f = new int[128];
        
        for (char c : t.toCharArray()) f[c]++;
        
        int l = 0, r = 0, cnt = t.length();
        int min = Integer.MAX_VALUE, start = 0;
        
        while (r < s.length()) {
            char c = s.charAt(r);
            
            if (f[c] > 0) cnt--;
            f[c]--;
            r++;
            
            while (cnt == 0) {
                if (r - l < min) {
                    min = r - l;
                    start = l;
                }
                
                char ch = s.charAt(l);
                f[ch]++;
                
                if (f[ch] > 0) cnt++;
                l++;
            }
        }
        
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}