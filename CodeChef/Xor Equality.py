import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


try:

    def solver(x, y):

        res = 1

        x = x % M

        if x == 0:

            return 0

        while y > 0:

            # if y is odd , extra multiply x
            if (y & 1) == 1:

                res = (res * x) % M

            # else y is even

            y = y >> 1

            x = (x * x) % M

        return res


    t = intInput()

    M = 10**9+7

    for i in range(t):

        n = intInput()

        print(solver(2, n-1) % M)

except Exception as e:

    pass
