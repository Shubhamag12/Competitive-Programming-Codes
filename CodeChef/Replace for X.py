try:

    def solver(n,x,p,k,a):

        a.sort()

        for i in range(n):

            if (a[p - 1] == x):

                return 0

            elif(k>=p and a[p-1]>=x):

                res = 0

                for j in range(p-1,-1,-1):

                    if(a[j]>x):

                        res+=1

                return res

            elif (p>=k and a[p - 1] <= x):

                res = 0

                for j in range(p-1,n):

                    if(a[j]<x):

                        res+=1

                return res

            else:

                return -1





    t = int(input())

    for i in range(t):

        n,x,p,k = map(int,input().split())

        a = list(map(int,input().split()))[:n]

        print(solver(n,x,p,k,a))





except Exception as e:
    pass