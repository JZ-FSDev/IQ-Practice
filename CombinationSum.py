# Self-written solution of "Combination Sum" from LeetCode.
# Faster than 61.38% of Python online submissions.
# author JZ-FSDev

# Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
# The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
# It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
def combinationSum(self, candidates, target):
    """
    :type candidates: List[int]
    :type target: int
    :rtype: List[List[int]]
    """
    res = []
    candidates.sort()
    
    def dfs(target, index, path):
        if target == 0:
            res.append(path)
        elif target > 0:
            for i in range(index, len(candidates)): # for unique combinations
                dfs(target - candidates[i], i, path + [candidates[i]]) #adds cand at index i as a list to end of path list
    
    dfs(target, 0, [])
    return res    
