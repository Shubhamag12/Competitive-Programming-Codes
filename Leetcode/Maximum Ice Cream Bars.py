def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def maxIceCream(self, costs, coins):

        costs.sort()

        count = 0

        for i in range(len(costs)):

            if coins - costs[i] >= 0:

                count += 1

                coins -= costs[i]

        return count