package top.fx2h.june;

public class J0612 {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int cnt = purchaseAmount / 10;
        int mod = purchaseAmount % 10;
        int realCost;
        if (mod < 5) {
            realCost = cnt * 10;
        } else {
            realCost = (cnt + 1) * 10;
        }
        return 100 - realCost;
    }
}
