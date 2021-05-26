class Solution:

    def converter(self, s):

        d = {}

        count = 0

        for i in s:

            if i not in d:
                d[i] = count

                count += 1

        r = ""

        for c in s:
            r += str(d[c])

        return r

    def findAndReplacePattern(self, words, pattern):

        cp = self.converter(pattern)

        res = []

        for word in words:

            if self.converter(word) == cp:
                res.append(word)

        return res
