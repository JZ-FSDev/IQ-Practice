# Self-written solution of "Valid Sudoku" from LeetCode.
# Faster than 67.71% of Python online submissions.
# author JZ-FSDev

# Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
# Each row must contain the digits 1-9 without repetition.
# Each column must contain the digits 1-9 without repetition.
# Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
# Note:
# A Sudoku board (partially filled) could be valid but is not necessarily solvable.
# Only the filled cells need to be validated according to the mentioned rules.
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
