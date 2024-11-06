import java.util.Arrays;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        System.out.println(exist(board, "ABCCED"));
    }

    static boolean exist(char[][] board, String word) {
        boolean[][] checker = new boolean[board.length][board[0].length];
        // Arrays.fill(checker, true);
        boolean res = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    res |= check(board, word, i, j, checker,"");
                }
            }
        }

        return res;
    }

    static boolean check(char[][] board, String word, int row, int col, boolean[][] checker,String p) {
        if(p.equals(word)){
            return true;
        }
        if (!isValid(row, col, board)) {
            return false;
        }

        if (checker[row][col]) {
            return false;
        }
        if (board[row][col] != word.charAt(0)) {
            return false;
        }

        checker[row][col] = true;
        boolean result = false;
        p += board[row][col];

        if (col < board[0].length) {
            result |= check(board, p, row, col + 1, checker,p);
        }

        if (row < board.length) {
            result |= check(board, p, row + 1, col, checker,p);
        }

        if(row > 0){
            result |= check(board, word, row - 1, col, checker,p);
        }

        if(col > 0){
            result |= check(board, word, row , col - 1, checker,p);
        }

        checker[row][col] = false;

        return result;

    }

    static boolean isValid(int row, int col, char[][] board) {

        if (row > -1 && col > -1 && row < board.length && col < board[0].length) {
            return true;
        }
        return false;
    }
}