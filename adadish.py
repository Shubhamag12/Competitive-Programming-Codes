# https://www.codechef.com/NOV20B/problems/ADADISH

t = int(input())
for i in range(t):
    n = int(input())
    a = list(map(int, input().rstrip().split()))
    a.sort(reverse = True)
    if(n == 1 or n == 2):
        print(max(a))
    else:
        x = a[0]
        y = a[1]
        i = 2
        q = 0
        while(1 < i < n):
            m = min(x, y)
            q += m
            if(m == x):
                x = a[i]
                y -= m
                i += 1
            else:
                y = a[i]
                x -= m
                i += 1
        print(q + max(x,y))
