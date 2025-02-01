abstract class Player {
    String name;
    char sym;
    TicTacToe ob ;

    abstract void makemove();

    boolean isvalid(int row,int col){
        if(row>=0 && row <=2 && col >=0 && col<=2){
            if(ob.board[row][col] == ' '){
                return true;
            }
        }
        return false;
    }
}
