// Last updated: 7/14/2026, 2:43:18 PM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2*(n-1);
        int remTime = time % cycle;

        if(remTime<=n-1)
           return 1 + remTime;
        else
           return (n-(remTime-(n-1)));
    }
}