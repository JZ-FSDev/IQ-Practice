# Self-written solution of "Combination Sum2" from LeetCode.
# Runtime: 61 ms, faster than 78.79% of Python online submissions for Combination Sum II.
# Memory Usage: 13.4 MB, less than 82.11% of Python online submissions for Combination Sum II.
# author JZ-FSDev

# Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
# Each number in candidates may only be used once in the combination.
# Note: The solution set must not contain duplicate combinations.

class Solution:
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
                for i in range(index, len(candidates)): # for unique combinations
                    if i > index and candidates[i] == candidates[i-1]:
                        continue
                    dfs(target - candidates[i], i + 1, path + [candidates[i]]) # adds cand at index i as a list to end of path list
        
        dfs(target, 0, [])
        return res   
