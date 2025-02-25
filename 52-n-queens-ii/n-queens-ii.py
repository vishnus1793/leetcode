class Solution:
    def isSafe(self, board, row, col):
        n = len(board)
        for i in range(n):
            if board[row][i] == 'Q' or board[i][col] == 'Q':
                return False
        i, j = row, col
        while i >= 0 and j < n:
            if board[i][j] == 'Q':
                return False
            i, j = i - 1, j + 1
        i, j = row, col
        while i < n and j < n:
            if board[i][j] == 'Q':
                return False
            i, j = i + 1, j + 1
        i, j = row, col
        while i < n and j >= 0:
            if board[i][j] == 'Q':
                return False
            i, j = i + 1, j - 1
        i, j = row, col
        while i >= 0 and j >= 0:
            if board[i][j] == 'Q':
                return False
            i, j = i - 1, j - 1
        return True

    def setQueen(self, board, row, ans):
        n = len(board)
        if row == n:
            l = []
            for i in range(n):
                s = ''.join(board[i])
                l.append(s)
            ans.append(l)
            return
        for i in range(n):
            if self.isSafe(board, row, i):
                board[row][i] = 'Q'
                self.setQueen(board, row + 1, ans)
                board[row][i] = '.'

    def totalNQueens(self, n):
        board = [['.' for _ in range(n)] for _ in range(n)]
        ans = []
        self.setQueen(board, 0, ans)
        return len(ans)

\