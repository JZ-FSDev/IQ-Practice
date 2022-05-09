# Self-written solution of "Search Insert Position" from LeetCode.
# Faster than 73.02% of Python online submissions.
# author JZ-FSDev

# Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
# You must write an algorithm with O(log n) runtime complexity.
def searchInsert(self, nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: int
    """
    def binarySearch(nums, target, high, low):
        mid = 0
        index = -1
        while low <= high and index == -1:
            mid = (high + low)/2
            if nums[mid] == target:
                index = mid
            elif nums[mid] < target:
                low = mid + 1
            else:
                high = mid - 1
        if low > high:
            index = low
        elif high < low:
            index = high
        return index
    return binarySearch(nums, target, len(nums) - 1, 0)
