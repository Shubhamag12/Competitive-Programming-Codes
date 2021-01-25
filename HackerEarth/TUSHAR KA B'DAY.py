# https://www.hackerearth.com/problem/algorithm/tushar-ka-bday/

t = int(input())
for j in range(t):
    n = int(input())
    a = list(map(int, input().split()[:n]))
    result = 0
    temp = [1, 0]
    sum = 0
    for i in range(n):
        sum = (sum + a[i])%2
        temp[sum] += 1
    result = result + (temp[0] * (temp[0] - 1) // 2) 
    result = result + (temp[1] * (temp[1] - 1) // 2) 
    
    print(result)
