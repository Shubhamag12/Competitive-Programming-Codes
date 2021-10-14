import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


class Solution:

    def numUniqueEmails(self, emails):

        s = set()

        for email in emails:

            local = email.split('@')[0]

            domain = email.split('@')[1]

            if '+' in local:

                s.add(local.split('+')[0].replace('.', '') + '@' + domain)

            else:

                s.add(local.replace('.', '') + '@' + domain)

        return len(s)