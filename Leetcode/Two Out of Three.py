from collections import defaultdict


def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def twoOutOfThree(self, nums1, nums2, nums3):

        d = defaultdict(set)

        res = []

        for ele in nums1:

            d[ele].add("n1")

        for ele in nums2:

            d[ele].add("n2")

        for ele in nums3:

            d[ele].add("n3")

        for ele in d:

            if len(d[ele]) >= 2:

                res.append(ele)

        return res


nums1 = list_input()

nums2 = list_input()

nums3 = list_input()

sol = Solution()

print(sol.twoOutOfThree(nums1, nums2, nums3))

