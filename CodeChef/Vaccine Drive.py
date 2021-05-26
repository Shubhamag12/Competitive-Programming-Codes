import sys
import math

def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


try:
    def solver(g, p, x):

        s = sum(x[g:])
        """
        print(s)

        print(s/p)

        print((s+x[g-1])/p)
        """
        print(math.floor(s/p) + 1, math.ceil((s+x[g-1])/p))

    t = intInput()

    for i in range(t):

        l = listInput()[:12]

        g = l[0]

        p = l[1]

        x = l[2:]

        solver(g, p, x)

except Exception as e:

    pass
