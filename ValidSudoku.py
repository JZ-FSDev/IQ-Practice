

def isValidSudoku(self, board):
    """
    :type board: List[List[str]]
    :rtype: bool
    """
    n = int(math.sqrt(len(board)))
    
    def rowColValid(row, col):
        for i in range(0, len(board)):
            if (board[i][col] == board[row][col] and i != row) or (board[row][i] == board[row][col] and i != col):
                return False
        return True
    
    def cellValid(r, c):
        for row in range((r/n )* n, (r/n )* n + n):
            for col in range((c/n )* n, (c/n )* n + n):
                if board[r][c] == board[row][col] and row != r and col != c:
                    return False
        return True
    
    for r in range(0, len(board)):
        for c in range(0, len(board[r])):
            if (board[r][c] != ".") and (not cellValid(r,c) or not rowColValid(r,c)):
                return False
    return True
