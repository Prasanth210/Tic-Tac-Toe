import java.util.Scanner;
class Human extends Player {

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

}
