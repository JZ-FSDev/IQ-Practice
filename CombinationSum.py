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
