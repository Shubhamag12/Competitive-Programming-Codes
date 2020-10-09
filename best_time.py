#https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxm = 0
        minm = 999999
        for i in range(len(prices)):
            if prices[i] < minm:
                minm = prices[i]
            else:
                maxm = max(maxm, prices[i] - minm)
                
        return maxm
