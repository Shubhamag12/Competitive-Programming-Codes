def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def fourSumCount(self, nums1, nums2, nums3, nums4):

        d = {}

        for a in nums1:

            for b in nums2:

                s = a + b

                if s in d:

                    d[s] += 1

                else:

                    d[s] = 1

        cnt = 0

        for c in nums3:

            for k in nums4:

                s = - (c + k)

                if s in d:

                    cnt += d[s]

        return cnt


sol = Solution()

print(sol.fourSumCount(nums1=list_input(), nums2=list_input(), nums3=list_input(), nums4=list_input()))
