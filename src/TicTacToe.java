public class TicTacToe {
    char[][] board;
    int row,col;

    void Call(int r,int c) {
        row=r; col=c;
        board = new char[row][col];
        init();
        disp();
        place(0,0,'O');
        place(1,0,'X');
        check();
    }
    void init(){
        for(int n=0;n<row;n++){
            for(int p=0;p<col;p++){
                board[n][p] = ' ';
            }
        }
    }

    void disp(){
        System.out.println("———————————————————");
        for(int n=0;n<row;n++){
            System.out.print("|  ");
            for(int p=0;p<col;p++){
                System.out.print(board[n][p]+"  |  ");
            }
            System.out.println();
            System.out.println("———————————————————");
        }
    }

    void place(int r ,int c,char p){
        if(r>=0  && r<=row && c>=0 && c<=col){
            board[r][c] = p;
        }
        disp();
    }

    boolean check(){
        //row check
        for(int n=0;n<row;n++){
            if(board[n][0] != ' ' && board[n][0] == board[n][1] && board[n][1] == board[n][2]){
                return true;
            }
        }
        // col check
        for(int n=0;n<row;n++){
            if(board[1][n] != ' ' && board[0][n] == board[1][n] && board[1][n] == board[2][n]){
                return true;
            }
        }

        //diogonal check
        for(int n=0;n<row;n++){
            if(board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] == board[1][1] && board[1][1] == board[2][0] ){
                return true;
            }
        }

        return false;
    }
}
