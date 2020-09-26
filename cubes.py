# https://www.hackerearth.com/problem/algorithm/balance-it-2-dc8872e2/

import math

n = int(input())

l = int(math.log2(n))
res = math.pow(2,l)

if(res == n):
    print(l)
else:
    x = int(math.floor(math.log(n-1)/math.log(3))) + 1
    print(x) 
