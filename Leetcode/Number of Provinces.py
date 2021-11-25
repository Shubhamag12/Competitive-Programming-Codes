def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Subset:

    def __init__(self, parent, rank):

        self.parent = parent

        self.rank = rank


class Solution:

    """

    Using union-find algorithm : Runtime - 480 ms, Memory - 14.8 MB

    """
    def find_parent(self, parent, i):

        if parent[i] == i:

            return i

        else:

            return self.find_parent(parent, parent[i])

    def findCircleNum(self, isConnected):

        groups = len(isConnected)

        parent = [i for i in range(len(isConnected))]

        for i in range(len(isConnected)):

            for j in range(len(isConnected[i])):

                if isConnected[i][j] == 1:

                    x = self.find_parent(parent, i)

                    y = self.find_parent(parent, j)

                    if x != y:
                        groups -= 1

                    parent[x] = y

        return groups

    """
    
    Using union-find algorithm(union by rnk and path compression) - Runtime - 228 ms, Memory - 14.6 MB
    
    """

    def find(self, subsets, node):

        if subsets[node].parent != node:

            subsets[node].parent = self.find(subsets, subsets[node].parent)

        return subsets[node].parent

    def union(self, subsets, u, v):

        if subsets[u].rank > subsets[v].rank:

            subsets[v].parent = u

        elif subsets[v].rank > subsets[u].rank:

            subsets[u].parent = v

        else:

            subsets[v].parent = u

            subsets[u].rank += 1

    def find_Circle_Num(self, isConnected):

        groups = len(isConnected)

        subsets = []

        for vertex in range(len(isConnected)):

            subsets.append(Subset(vertex, 0))

        for i in range(len(isConnected)):

            for j in range(len(isConnected[i])):

                if isConnected[i][j] == 1:

                    x = self.find(subsets, i)

                    y = self.find(subsets, j)

                    if x != y:

                        groups -= 1

                    self.union(subsets, x, y)

        return groups

isConnected = [[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]

sol = Solution()

print(sol.findCircleNum(isConnected))

print(sol.find_Circle_Num(isConnected))
