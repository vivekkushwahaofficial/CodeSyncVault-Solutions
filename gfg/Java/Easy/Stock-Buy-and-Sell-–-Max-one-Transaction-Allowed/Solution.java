class Solution {
	public int maxProfit(int[] prices) {
		int minSoFar = prices[0];
		int res = 0;
		for (int i = 1; i < prices.length; i++) {
			minSoFar = Math.min(minSoFar, prices[i]);
			res = Math.max(res, prices[i] - minSoFar);
		}
		return res;
	}
}