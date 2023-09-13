def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        res = []

        res.append(pref[0])

        n = len(pref)

        for i in range(1, n):
            res.append(pref[i - 1] ^ pref[i])

        return res