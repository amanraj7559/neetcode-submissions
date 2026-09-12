class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if (board[i][j] == '.') continue;
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }  
        for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if (board[j][i] == '.') continue;
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Character> set =new HashSet<>();
                for(int row=i;row<i+3;row++){
                    for(int column=j;column<j+3;column++){
                        if (board[row][column] == '.') continue;
                        if(set.contains(board[row][column])) return false;
                        set.add(board[row][column]);
                    }
                }
            }
        }
        return true;     
    }
}