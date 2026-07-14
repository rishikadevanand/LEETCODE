// Last updated: 7/14/2026, 2:43:22 PM
class Solution 
{
    public boolean isSameAfterReversals(int num) 
    {        
        if(num % 10 != 0)
        {
            return true;
        }
        else
        {
            return num==0;
        }
    }
}
