public class JuZhengLuJing012 {
    public boolean exist(char[][] board, String word) {
        char[] wordChar = word.toCharArray();
        int lengthOfWord = wordChar.length;
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if(dfs(board,i,j,0,wordChar)) return true;
            }
        }
        return false;

    }
    public boolean dfs(char[][] board, int i, int j, int currentPos,char[] wordChar){
        if(i<0 || i>board.length || j<0 || j>board[0].length || board[i][j]!=wordChar[currentPos] || currentPos>wordChar.length-1){return false;}
        char temp = board[i][j];
        board[i][j] = '/';
        if(dfs(board,i+1,j,currentPos-1,wordChar) ||
                dfs(board,i-1,j,currentPos-1,wordChar) ||
                dfs(board,i,j+1,currentPos-1,wordChar) ||
                dfs(board,i,j-1,currentPos-1,wordChar)) return true;
        board[i][j] = temp;
        return false;
    }
}
