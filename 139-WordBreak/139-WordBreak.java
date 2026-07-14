// Last updated: 7/14/2026, 2:46:53 PM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean []flag = new boolean[n+1];
        flag[0] = true;
        for(int i=1;i<=n;i++)
        {
            for(String str : wordDict)
            {
                int start = i-str.length();
                if(start >= 0 && flag[start] && str.equals(s.substring(start,i)))
                {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[n];
    }
}