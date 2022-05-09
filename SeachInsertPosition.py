
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
