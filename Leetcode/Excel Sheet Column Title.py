class Solution:
    def convertToTitle(self, n: int) -> str:

        res = ""

        while n > 0:

            rem = (n-1) % 26

            res = chr(ord('A') + rem) + res

            n = (n-1) // 26

        return res
        
