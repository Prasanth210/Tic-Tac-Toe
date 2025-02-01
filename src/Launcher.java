import java.util.*;
public class Launcher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int row=scan.nextInt();
//        int col=scan.nextInt();
//        char c=scan.next().charAt(0);

        TicTacToe game = new TicTacToe();
        game.Call(3,3);
      //  game.place(row,col,c);

    }
}
