public class max_profit {
    public int maxProfit(int[] prices) {
        return recur(prices, 0, false);
    }

    private int recur(int[] prices, int i, boolean bought) {
        if (i == prices.length) {
            return 0;
        }
        int res = recur(prices, i + 1, bought);
        if (bought) {
            res = Math.max(res, prices[i] + recur(prices, i + 1, false));
        } else {
            res = Math.max(res, -prices[i] + recur(prices, i + 1, true));
        }
        return res;
    }
}