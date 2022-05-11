# Self-written solution of "Combination Sum2" from LeetCode.
# Can be more efficient (exceeds time limit, but works)
# author JZ-FSDev

# Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
# Each number in candidates may only be used once in the combination.
# Note: The solution set must not contain duplicate combinations.
def combinationSum2(self, candidates, target):
    """
    :type candidates: List[int]
    :type target: int
    :rtype: List[List[int]]
    """
    res = []
    candidates.sort()

    def dfs(target, index, path):
        if target == 0 and path not in res:
            res.append(path)
        elif target > 0:
            for i in range(index + 1, len(candidates)): # for unique combinations
                dfs(target - candidates[i], i, path + [candidates[i]]) #adds cand at index i as a list to end of path list
                
    dfs(target, -1, [])
    return res    
