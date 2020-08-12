# https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

n, m = map(int, input().split())
v = [0] * (n + 1)

for _ in range(m):
    a, b, k = map(int, input().split())
    v[a] += k
    if b + 1 <= n:
        v[b+1] -= k
        
maximum_sum = 0
sum = 0

for i in v:
    sum += i
    maximum_sum = max(maximum_sum, sum)

print(maximum_sum)    
