// Last updated: 7/14/2026, 2:43:07 PM
class Solution {
    public boolean checkGoodInteger(int n) {
       int digitSum=0;
        int SqSum=0;
        while(n>0){
            int digit=n%10;
            digitSum+= digit;
            SqSum+= digit*digit;
            n/=10;
        }
        return (SqSum-digitSum)>=50;
    }
}