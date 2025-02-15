import java.util.*;
public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TicTacToe game = new TicTacToe();

        game.Call(3,3);

        System.out.println("Choose Game Mode:");
        System.out.println("1. Two Player Mode");
        System.out.println("2. Play Against Computer");

        int choice = scan.nextInt();
        scan.nextLine();

        Player p1,p2;

        System.out.println("Enter player one name : ");
            String n1=scan.nextLine();
            p1=new Human(n1,'X',game);

        if(choice == 1) {
            System.out.println("Enter player two name : ");
            String n2=scan.nextLine();
            p2=new Human(n2,'O',game);
        }
        else{
            p2= new Computer("Computer",'O',game);
        }


        Player cp = p1;
        boolean won=false;
        while(!game.isfill()){
            System.out.println(cp.name + " turn now ");
            cp.makemove();

            game.disp();
            if(game.check()){
                System.out.println(cp.name + " has won the Game");
                won=true;
                break;

            }
            cp = (cp == p1) ? p2 : p1;
            }
        if(game.isfill() && !won){
            System.out.println("Game is Draw!!");
        }
    }
}
