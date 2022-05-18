def isValidSudoku(self, board):
    """
    :type board: List[List[str]]
    :rtype: bool
    """
    n = int(math.sqrt(len(board)))
    
    for r in range(0, len(board)):
        for c in range(0, len(board[r])):
            if (board[r][c] != ".") and (not cellValid(r,c) or not rowColValid(r,c)):
                return False
    return True
  
