def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def twoSum(self, numbers, target):

        i = 0

        j = len(numbers) - 1

        while i < j:

            s = numbers[i] + numbers[j]

            if s == target:

                return [i + 1, j + 1]

            elif s > target:

                j -= 1

            else:

                i += 1


sol = Solution()

print(sol.twoSum(numbers=list_input(), target=int_input()))

