# https://www.hackerrank.com/challenges/angry-professor/problem

t = int(input())

for t_itr in range(t):
    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    a = list(map(int, input().rstrip().split()))

    count = 0
    for i in range(len(a)):
        if(a[i] <= 0):
            count += 1
    if(count >= k):
        print('NO')
    else:
        print('YES')   
