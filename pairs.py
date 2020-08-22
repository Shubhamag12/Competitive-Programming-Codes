# https://www.hackerrank.com/challenges/pairs/problem

nk = input().split()
n = int(nk[0])
k = int(nk[1])
a = list(map(int, input().rstrip().split()))

count = 0
lower_index = 0 
upper_index = 1

arr = sorted(a)

while(upper_index < n):
    diff = arr[upper_index] - arr[lower_index]

    if(diff == k):
        count += 1
        upper_index += 1
    elif(diff > k):
        lower_index += 1
    else:
        upper_index += 1
        
print(count)
