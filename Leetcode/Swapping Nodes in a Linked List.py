import sys


def intInput(): return int(input())


def sepInput(): return map(int, input().split())


def listInput(): return list(map(int, input().split()))


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def swapNodes(self, head, k):

        left_node = head

        right_node = head

        for i in range(1, k):
            left_node = left_node.next

        temp = left_node

        while temp.next:
            right_node = right_node.next

            temp = temp.next

        left_node.val, right_node.val = right_node.val, left_node.val

        return head