def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


"""
Runtime : 30 ms
Memory Usage : 14.2 MB
"""

class Solution:

    def detectCapitalUse(self, word):

        idx_arr = []

        for i in range(len(word)):

            if 65 <= ord(word[i]) <= 90:

                idx_arr.append(i)

        if len(idx_arr) == 0 or (len(idx_arr) == 1 and idx_arr[0] == 0) or (len(idx_arr) == len(word)):

            return True

        else:

            return False


sol = Solution()

print(sol.detectCapitalUse(word=input()))

