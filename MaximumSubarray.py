import sys

def maxSubArray(self, nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    currMax = 0
    globalMax = -sys.maxint-1
    for n in nums:
        currMax += n
        if currMax < n:
            currMax = n
        if globalMax < currMax:
            globalMax = currMax
    return globalMax
            
