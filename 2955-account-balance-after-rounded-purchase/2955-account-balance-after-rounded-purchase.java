class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return 100 - (int) (Math.round(purchaseAmount / 10.0) * 10);
    }
}