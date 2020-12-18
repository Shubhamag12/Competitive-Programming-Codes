# https://leetcode.com/problems/set-matrix-zeroes/

import numpy as np

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        r = 0
        c = 0
        rows = np.size(matrix, 0)
        col = np.size(matrix, 1)
        for i in range(col):
            if matrix[0][i] == 0:
                r = 1
                break

        for i in range(rows):
            if matrix[i][0] == 0:
                c = 1
                break

        for i in range(1, rows):
            for j in range(1, col):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0
        
        for i in range(1,col):
            if matrix[0][i] == 0:
                for j in range(1,rows):
                    matrix[j][i] = 0
            
        for i in range(1,rows):
            if matrix[i][0] == 0:
                for j in range(1,col):
                    matrix[i][j] = 0
                    
        if r == 1:
            for i in range(col):
                matrix[0][i] = 0
                
        if c == 1:
            for i in range(rows):
                matrix[i][0] = 0
                
        return matrix
            
            
