import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


try:

    arr = [[0 for j in range(1001)] for i in range(1001)]

    arr[1][1] = 1

    for i in range(2, 1001):
        arr[i][1] = arr[i - 1][1] + i

    for i in range(1, 1001):

        temp = i

        for j in range(2, 1001):
            arr[i][j] = arr[i][j - 1] + temp

            temp += 1

    t = intInput()

    for _ in range(t):

        x1, y1, x2, y2 = sepInput()

        s = 0

        for i in range(x1, x2+1):

            s += arr[i][y1]

        for i in range(y1+1, y2+1):

            s += arr[x2][i]

        print(s)

except Exception as e:

    pass
