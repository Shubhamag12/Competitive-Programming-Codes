#https://www.hackerrank.com/challenges/minimum-loss/problem

n = int(input())
price = list(map(int, input().rstrip().split()))

sorted_array = sorted(price)

diff = 10**10

for i in range(len(sorted_array) - 1):
    min_diff = sorted_array[i+1] - sorted_array[i]
    if(min_diff < diff and (price.index(sorted_array[i]) > price.index(sorted_array[i+1]))):
        diff = min_diff
    
print(diff)
