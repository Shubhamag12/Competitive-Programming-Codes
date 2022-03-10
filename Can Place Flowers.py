def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def canPlaceFlowers(self, flowerbed, n: int) -> bool:

        if n == 0:

            return True

        for i in range(len(flowerbed)):

            if flowerbed[i] == 0:

                if 0 <= i - 1 < len(flowerbed):

                    left = flowerbed[i - 1]

                else:

                    left = 0

                if 0 <= i + 1 < len(flowerbed):

                    right = flowerbed[i + 1]

                else:

                    right = 0

                if not left and not right:

                    n -= 1

                    flowerbed[i] = 1

                    if n == 0:
                        
                        return True

        return False