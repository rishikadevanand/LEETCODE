// Last updated: 7/14/2026, 2:43:11 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = ( (purchaseAmount + 5) / 10 * 10);
           // Rounded off to the multiple of 10
        int totalBalance = 100 - roundedAmount;
        return totalBalance;
    }
}