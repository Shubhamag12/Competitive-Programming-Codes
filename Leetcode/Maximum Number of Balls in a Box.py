def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def digit_sum(self, num):

        digit_s = 0

        while num > 0:

            digit_s += (num % 10)

            num = num // 10

        return digit_s

    def countBalls(self, lowLimit: int, highLimit: int) -> int:

        d = {}

        for i in range(lowLimit, highLimit + 1):

            d_sum = self.digit_sum(i)

            if d_sum not in d:

                d[d_sum] = 1

            else:

                d[d_sum] += 1

        max_balls = 0

        for ele in d.keys():

            if d[ele] > max_balls:

                max_balls = d[ele]

        return max_balls


sol = Solution()

print(sol.countBalls(lowLimit=int_input(), highLimit=int_input()))