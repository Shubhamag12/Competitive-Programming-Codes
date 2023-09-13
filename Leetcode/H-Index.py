def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:
    def hIndex(self, citations: List[int]) -> int:

        citations.sort(reverse=True)

        if len(citations) == 1 and citations[0] > 0:

            return 1

        if citations[-1] >= len(citations):

            return len(citations)

        for i in range(len(citations)):

            if citations[i] < i + 1:

                return i

        return 0
    
sol = Solution()

print(sol.hIndex(citations=list_input()))


