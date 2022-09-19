def list_input(): return list(map(int, input().split()))


def sep_input(): return map(int, input().split())


def int_input(): return int(input())


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:

    def getIntersectionNode(self, headA, headB):

        if headA is None or headB is None:
            return None

        ptr_A = headA

        ptr_B = headB

        while ptr_A is not ptr_B:

            if ptr_A is None:

                ptr_A = headB  # imp

            else:

                ptr_A = ptr_A.next

            if ptr_B is None:

                ptr_B = headA

            else:

                ptr_B = ptr_B.next

        return ptr_A