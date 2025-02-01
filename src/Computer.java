import java.util.Random;
class Computer extends Player {

    Computer(String name,char sym,TicTacToe ob){
        this.name=name;
        this.sym=sym;
        this.ob=ob;
    }

    void makemove(){
        int row,col;
        Random ran=new Random();
        do{

          row=ran.nextInt(3);
          col=ran.nextInt(3);

        }while(!isvalid(row,col));
        ob.place(row,col,sym);
    }

}
