import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


try:

    t = intInput()

    for i in range(t):

        D, d, a, b, c = sepInput()

        max_dis = D * d

        if max_dis < 10:

            print(0)

        elif max_dis >= 10 and max_dis < 21:

            print(a)

        elif max_dis >= 21 and max_dis < 42:

            print(b)

        elif max_dis >= 42:

            print(c)

except Exception as e:

    pass
