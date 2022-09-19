def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


class Solution:

    def isSafe(self, row, col, board, n):

        """
        Only 3 dir we have to check
        1. Upper left diagonal
        2. Left Row
        3. Lower left diagonal
        """
        col_cop = col
        row_cop = row

        # Upper Left diagonal
        while row >= 0 and col >= 0:

            if board[row][col] == 'Q':
                return False

            row -= 1

            col -= 1

        col = col_cop

        row = row_cop

        # Left row
        while col >= 0:

            if board[row][col] == 'Q':
                return False

            col -= 1

        col = col_cop

        row = row_cop
        # Lower left diagonal
        while row < n and col >= 0:

            if board[row][col] == 'Q':
                return False

            row += 1

            col -= 1

        return True

    def solve(self, col, board, res, n):

        if col == n:
            res.append([])

            for i in range(n):

                res[-1].append("")

                for j in range(n):

                    if board[i][j]:

                        res[-1][-1] += 'Q'

                    else:

                        res[-1][-1] += '.'

            return

        # check for each row for a column
        for row in range(n):

            if self.isSafe(row, col, board, n):
                board[row][col] = 'Q'

                # recur for next column
                self.solve(col + 1, board, res, n)

                # backtrack
                board[row][col] = '.'

    def totalNQueens(self, n):

        res = []

        board = [["." * n] * n for _ in range(n)]

        self.solve(0, board, res, n)

        return len(res)


sol = Solution()

print(sol.totalNQueens(n=int_input()))