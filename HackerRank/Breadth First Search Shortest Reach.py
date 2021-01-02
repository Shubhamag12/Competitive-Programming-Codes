from collections import defaultdict

class Graph:

    def __init__(self,vertices,edges):

        self.v = vertices

        self.e = edges

        self.g = defaultdict(list)

    def addEdge(self,u,v):

        self.g[u].append(v)

    def printGraph(self):

        print(self.g)

    def minEdgesBFS(self,start):

        visited = [False]*self.v

        # print("vis",visited)
        distance = [-1]*self.v

        # print("dis",distance)
        queue = []

        distance[start] = 0

        visited[start] = True

        queue.append(start)

        while(queue):

            x = queue.pop(0)

            for i in self.g[x]:

                if(visited[i]==False):

                    distance[i] = distance[x] + 6

                    queue.append(i)

                    visited[i] = True

        return distance

q = int(input())

for i in range(q):

    n,m = map(int,input().split())

    g = Graph(n,m)

    for j in range(m):

        u,v = map(int,input().split())

        g.addEdge(u-1,v-1)

        g.addEdge(v-1,u-1)

    #g.printGraph()

    start = int(input())

    res = g.minEdgesBFS(start-1)

    for k in range(len(res)):

        if(k!=start-1):

            print(res[k],end=" ")

    print()

