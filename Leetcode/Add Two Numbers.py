def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


# Definition for singly-linked list.
class ListNode:

    def __init__(self, val=0, next=None):

        self.val = val

        self.next = next

class Solution:

    def addTwoNumbers(self, l1, l2):

        carry = 0

        res = curr = ListNode(0)

        while l1 or l2 or carry:

            if l1:
                carry += l1.val

                l1 = l1.next

            if l2:
                carry += l2.val

                l2 = l2.next

            curr.next = ListNode(carry % 10)

            curr = curr.next

            carry //= 10

        return res.next
