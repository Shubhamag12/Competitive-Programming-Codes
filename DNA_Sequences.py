# https://leetcode.com/problems/repeated-dna-sequences/

class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        ans = []
        if len(s) == 0:
            return ans
        subDict = {}
        for i in range(len(s) - 9):
            sub = s[i:i+10]
            subDict[sub] = subDict.get(sub, 0) + 1
            
        for i in subDict.keys():
            if subDict[i] > 1:
                ans.append(i)
        return ans
