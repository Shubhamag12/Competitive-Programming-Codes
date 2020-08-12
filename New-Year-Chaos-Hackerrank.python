#https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

import math
import os
import random
import re
import sys

# Complete the minimumBribes function below.
def minimumBribes(q):
    ans = 0
    for i in range(len(q)):
        if(q[i] - (i+1) > 2):
            return "Too chaotic"

    for i in range(len(q)):
        for j in range(max(0, q[i]-2), i):
            if (q[j] > q[i]):
                ans += 1
                
    return ans             


if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        n = int(input())

        q = list(map(int, input().rstrip().split()))

        print(minimumBribes(q))
