https://leetcode.com/problems/minimum-path-sum/

import numpy as np

class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        rows = np.size(grid, 0)
        if(rows == 0):
            return 0
        col = np.size(grid, 1)
        a = [[0 for j in range(col)] for i in range(rows)]
        a[0][0] = grid[0][0]
        
        for i in range(1,col):
            a[0][i] = a[0][i-1] + grid[0][i]
        

        for i in range(1,rows):
            a[i][0] = a[i-1][0] + grid[i][0]

        for i in range(1,rows):
            for j in range(1,col):
                a[i][j] = grid[i][j] + min(a[i-1][j], a[i][j-1])
        
        return a[rows-1][col-1]
