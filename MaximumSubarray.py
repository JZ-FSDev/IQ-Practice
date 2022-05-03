# Self-written solution of "Maximum Subarray" from LeetCode.
# Faster than 85.52% of Python online submissions.
# author JZ-FSDev

import sys

# Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
# A subarray is a contiguous part of an array.
def maxSubArray(self, nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    # Kadane's algorithm

    currMax = 0
    globalMax = -sys.maxint-1
    for n in nums:
        currMax += n
        if currMax < n:
            currMax = n
        if globalMax < currMax:
            globalMax = currMax
    return globalMax
            
