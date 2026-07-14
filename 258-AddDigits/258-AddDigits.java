// Last updated: 7/14/2026, 2:45:39 PM
class Solution {
    public int addDigits(int num) {

        while(num>9)
        {
            int sum =0;

            while(num>0)
            {
              sum = sum + num % 10;
              num = num/10;
            }
            num = sum;
        }
        return num;
    }
}