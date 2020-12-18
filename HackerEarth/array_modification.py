# https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/array-modification-2-dc88ff8a/description/

n = int(input())
a = list(map(int, input().split()[:n]))
pre = [0]*(n+2)
suf = [0]*(n+2) 

for i in range(1, n):
    pre[i] = pre[i-1]//2 + a[i]
    
for i in range(n-1, -1, -1):
    suf[i] = suf[i+1]//2 + a[i]

print(suf)
print(a)
print(pre)

res = -1
for i in range(1,n):
    res = max(a[i] + abs(suf[i] - a[i]) + abs(pre[i] - a[i]), res)
    print(res)
print(res)
