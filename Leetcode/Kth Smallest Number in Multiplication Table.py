def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def find_pos(self, m, n,  mid):

        res = 0

        for i in range(1, m+1):

            j = min(n, mid//i)

            if not j:

                break

            res += j

        return res

    def findKthNumber(self, m: int, n: int, k: int) -> int:

        if k == 1:

            return 1

        if k == m*n:

            return m*n

        low, high = 1, (m * n)

        while low < high:

            mid = (low + high) // 2

            pos = self.find_pos(m, n, mid)

            if pos < k:

                low = mid + 1

            else:

                high = mid

        return low


m = int_input()

n = int_input()

k = int_input()

sol = Solution()

print(sol.findKthNumber(m, n, k))