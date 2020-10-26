# https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/cyclic-binary-string/problem

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'maximumPower' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def maximumPower(s):
    n = len(s)
    count = 0
    start = 0
    end = 0
    for i in range(n):
        if s[i] == '0':
            start += 1
        else:
            break
    for i in range(n-1, -1, -1):
        if s[i] == '0':
            end += 1
        else:
            break
   
    result = start + end
    
    for i in range(n):
        if s[i] == '0':
            count += 1
        if(count > result):
            result = count
        if s[i] == '1':
            count = 0
        
    if(result >= n):
        result = -1
    
    return result
    
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = maximumPower(s)

    fptr.write(str(result) + '\n')

    fptr.close()
