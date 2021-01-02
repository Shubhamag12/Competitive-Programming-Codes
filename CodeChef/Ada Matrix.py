# https://www.codechef.com/SEPT20B/problems/ADAMAT/

try:

    def solver(n,arr):

        count = 0

        for i in range(n-1,0,-1):

            d = arr[i][i-1]+1

            if(d!=arr[i][i]):

                count+=1

                do = i+1

                for j in range(do):

                    for k in range(j,do):

                        tr = arr[j][k]

                        arr[j][k] = arr[k][j]

                        arr[k][j] = tr

        print(count)




    t = int(input())

    for i in range(t):

        n = int(input())

        arr = []

        for j in range(n):

            arr.append(list(map(int,input().split())))

        solver(n,arr)

except Exception as e:

    pass