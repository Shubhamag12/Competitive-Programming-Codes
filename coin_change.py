# https://www.hackerrank.com/challenges/coin-change/problem

def getWays(n, c):
    arr = [0 for h in range(n+1)]
    arr[0] = 1
    for k in c:
        for i in range(1, n+1):
            if(n>=k):
                if(i>=k):
                    arr[i] += arr[i-k] 
    return arr
                    
first_multiple_input = input().rstrip().split()
n = int(first_multiple_input[0])
m = int(first_multiple_input[1])
c = list(map(int, input().rstrip().split()))
ways = getWays(n, c)
print(ways[-1])
