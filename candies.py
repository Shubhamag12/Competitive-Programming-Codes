# https://www.hackerrank.com/challenges/candies/problem

n = int(input())
a = []
for _ in range(n):
    a_item = int(input())
    a.append(a_item)

res = [1]*len(a)

for i in range(1, len(a)):
    if(a[i] > a[i-1]):
        res[i] = res[i-1] + 1
for i in range(len(a) - 1, 0, -1):
    if( (a[i-1] > a[i]) and (res[i-1] <= res[i]) ):
        res[i-1] = res[i] + 1

print(sum(res))
