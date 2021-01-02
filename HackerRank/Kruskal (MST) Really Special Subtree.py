class Graph:

    def __init__(self, vertices):

        self.V = vertices

        self.graph = []

    def addEdge(self, src,des,wt):

        self.graph.append([src,des,wt])

    def printGraph(self):

        print(self.graph)

    def find(self,parent,i):

        if(parent[i]==i):

            return i

        return self.find(parent,parent[i])

    def union(self,parent,rank,x,y):

        xroot = self.find(parent,x)

        yroot = self.find(parent,y)

        # attach smaller rank tree under root of higher rank tree
        if(rank[xroot]<rank[yroot]):

            parent[xroot] = yroot

        elif(rank[xroot]>rank[yroot]):

            parent[yroot] = xroot

        else:

            parent[yroot] = xroot

            rank[xroot]+=1

    def KruskalMST(self):

        #result = []

        e = 0

        reswt = 0

        self.graph = sorted(self.graph,key=lambda item:item[2])

        #i nitialize parent and rank of each vertex
        parent = []

        rank = []

        for node in range(self.V):

            parent.append(node)

            rank.append(0)

        # loop until no. of edges < V-1
        i = 0 # variable to loop on edges in actual graph

        while(e<self.V-1):

            u,v,w = self.graph[i]

            i+=1

            # now we will add this edge in result if it is not forming a cycle
            u_find = self.find(parent,u)

            v_find = self.find(parent,v)

            # now if they do not belongs to same set so they will not form a cycle
            # add edge to resultant MST
            # else discard that edge
            if(u_find!=v_find):

                # result.append([u,v,w])
                reswt+=w

                e+=1

                self.union(parent,rank,u_find,v_find)

        return reswt

n,e = map(int,input().split())

g = Graph(n)

for i in range(e):

    u,v,w = map(int,input().split())

    g.addEdge(u-1,v-1,w)

print(g.KruskalMST())
