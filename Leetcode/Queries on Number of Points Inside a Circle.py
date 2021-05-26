class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:

        res = []

        for i in range(len(queries)):

            c = 0

            for j in range(len(points)):

                if ((queries[i][0] - points[j][0]) ** 2) + ((queries[i][1] - points[j][1]) ** 2) <= (
                        queries[i][2] ** 2):
                    c += 1

            res.append(c)

        return res

