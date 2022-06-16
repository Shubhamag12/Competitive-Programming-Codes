def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def removeOuterParentheses(self, s):

        n = len(s)

        res = []

        opened = 0

        for i in range(n):

            if s[i] == '(':

                if opened > 0:

                    res.append(s[i])

            if s[i] == ')':

                if opened > 1:

                    res.append(s[i])

            if s[i] == '(':

                opened += 1

            else:

                opened -= 1

        return "".join(res)


sol = Solution()

print(sol.removeOuterParentheses(s=input()))