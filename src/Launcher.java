import java.util.*;
public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.Call(3,3);
        String n1=scan.nextLine();
        String n2=scan.nextLine();

        Human p1=new Human(n1,'X',game);
        Human p2=new Human(n2,'O',game);

        Human cp;
        cp=p1;

        while(!game.isfill()){
            System.out.println(cp.name + " turn now ");
            cp.makemove();

            game.disp();
            if(game.check()){
                System.out.println(cp.name + " has won the Game");
                break;
            }
            cp = (cp == p1) ? p2 : p1;
            }
        if(game.isfill()){
            System.out.println("Game is Draw!!");
        }
    }
}
