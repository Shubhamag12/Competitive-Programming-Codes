def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def maxProfit(self, prices) -> int:

        if len(prices) < 2:
            
            return 0

        min_price = prices[0]

        max_profit = 0

        for i in range(1, len(prices)):

            if prices[i] < min_price:

                min_price = prices[i]

            else:

                max_profit = max(max_profit, prices[i] - min_price)

        return max_profit
