def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def findMinArrowShots(self, points):

        points.sort(key= lambda item: item[1])

        cnt = 1

        x = points[0][1]

        for i in range(1, len(points)):

            if points[i][0] <= x <= points[i][1]:

                continue

            else:

                cnt += 1

                x = points[i][1]

        return cnt


points = []

while True:

    l = list_input()

    if not l:

        break

    points.append(l)

sol = Solution()

print(sol.findMinArrowShots(points))
