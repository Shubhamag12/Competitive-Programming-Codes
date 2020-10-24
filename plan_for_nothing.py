https://www.hackerearth.com/problem/algorithm/plan-for-nothing-c5768603/description/

n = int(input())
a = [0]*(10**6 + 5)

for i in range(n):
    m = int(input())
    for j in range(m):
        lr = int(input().split())
        l = int(lr[0])
        r = int(lr[1])
        a[l] += 1
        a[r+1] -= 1

for i in range(1, len(a)):
    a[i] += a[i-1]

ans = -1
for i in range(1, 10**6):
    if(a[i] == 0):
        ans = i
        break

print(ans)
    
