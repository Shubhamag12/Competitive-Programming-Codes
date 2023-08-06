def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def minimumRounds(self, tasks):

        d = {}

        for ele in tasks:

            if ele not in d.keys():

                d[ele] = 1

            else:

                d[ele] += 1

        count = 0

        for key, value in d.items():

            if value == 1:

                return -1

            if value % 3 == 0:

                count += value // 3

            else:

                count += (value // 3) + 1

        return count


sol = Solution()

print(sol.minimumRounds(tasks=list_input()))