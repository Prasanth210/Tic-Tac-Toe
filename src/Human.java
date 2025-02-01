import java.util.Scanner;
public class Human {
    String name;
    char sym;
    TicTacToe ob ;
    Human(String name,char sym,TicTacToe ob){
        this.name=name;
        this.sym=sym;
        this.ob=ob;
    }

    void makemove(){
        int row,col;
        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter row and column : ");
            row=scan.nextInt();
            col=scan.nextInt();

        }while(!isvalid(row,col));
        ob.place(row,col,sym);
    }
    boolean isvalid(int row,int col){
        if(row>=0 && row <=2 && col >=0 && col<=2){
            if(ob.board[row][col] == ' '){
                return true;
            }
        }
        return false;
    }
}
