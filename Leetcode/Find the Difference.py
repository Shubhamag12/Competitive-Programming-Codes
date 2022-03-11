def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def findTheDifference(self, s: str, t: str) -> str:

        ds = {}

        dt = {}

        for ch in t:

            if ch not in dt:

                ds[ch] = dt[ch] = 0

                ds[ch] = s.count(ch)

                dt[ch] = t.count(ch)

        for ch in dt:

            if dt[ch] > ds[ch]:
                
                return ch

