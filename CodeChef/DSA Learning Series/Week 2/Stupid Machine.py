# cook your dish here
t = int(input())
for i in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    min_sofar = 10000000001
    total = 0
    for a in arr:
        if(a < min_sofar):
            min_sofar = a
        total += min_sofar
    print(total)
