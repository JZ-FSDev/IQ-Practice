# Self-written solution of "Add Binary" from LeetCode.
# Faster than 90.52% of Python online submissions.
# author JZ-FSDev

class Solution(object):
  
    #Given two binary strings a and b, return their sum as a binary string.
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        return format(int(a, 2) + int(b, 2), "b")
        
