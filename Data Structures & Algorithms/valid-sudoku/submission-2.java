class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            if(!checkRow(board[i]))
                return false;
            if(!checkCol(board, i))
                return false;
        }

        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                Set<Character> seen = new HashSet<>();

                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        char num = board[r][c];

                        if (num == '.') {
                            continue;
                        }

                        if (!seen.add(num)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    private boolean checkRow(char[] row) {
        HashSet<Character> set = new HashSet<Character>();

        for (int i=0; i<9; i++) {
            char c = row[i];

            if (c=='.')
                continue;
            
            if (!set.contains(c)) {
                set.add(c);
                continue;
            }

            return false;
        }

        return true;
    }

    private boolean checkCol(char[][] board, int col) {
        HashSet<Character> set = new HashSet<Character>();

        for (int i=0; i<9; i++) {
            char c = board[i][col];

            if (c=='.')
                continue;
            
            if (!set.contains(c)) {
                set.add(c);
                continue;
            }

            return false;
        }

        return true;
    }
}
