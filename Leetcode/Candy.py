def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())

class Solution:
    def candy(self, ratings) -> int:

        n = len(ratings)

        candies = [1] * n

        for i in range(1, n):

            if ratings[i] > ratings[i - 1]:
                candies[i] = candies[i-1] + 1

        for i in range(n-2, -1, -1):

            if ratings[i] > ratings[i+1]:

                candies[i] = max(candies[i], candies[i+1] + 1)

        return sum(candies)




sol = Solution()

print(sol.candy(ratings=list_input()))