package TicTacToe;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board  = new Board();
        System.out.println("--------------------------------------------------------");
        System.out.println("--               WelCome to Tic-Tac-Toe               --");
        System.out.println("--------------------------------------------------------");
        System.out.println();

        System.out.print("Enter Player1 name: ");
        String name1 = scanner.next();
        System.out.print("Enter Player2 name: ");
        String name2 = scanner.next();

        Player player1  = new Player(name1,'X'), player2 = new Player(name2,'O');

        Winning win = new Winning();
        board.printBoard();

        while(win.won!=1){
            System.out.println(player1.playerId+" "+player1.playerName+" enter your position(1-9): ");
            int pos = scanner.nextInt();
            while(board.checkPosition(pos)){
                System.out.print("Invalid Position. Pick a valid position!: ");
                pos = scanner.nextInt();
            }
            board.setPosition(pos,player1.symbol);
            win.player1Position.add(pos);
            win.checkWinner();
            if(!win.checkWinner()){
                board.printBoard();
                break;
            }
            board.printBoard();

            System.out.println(player2.playerId+ " "+player2.playerName+" enter your position(1-9): ");
            pos = scanner.nextInt();
            while(board.checkPosition(pos)){
                System.out.print("Invalid Position. Pick a valid position!: ");
                pos = scanner.nextInt();
            }
            board.setPosition(pos,player2.symbol);
            win.player2Position.add(pos);
            win.checkWinner();
            if(!win.checkWinner()){
                board.printBoard();
                break;
            }
            board.printBoard();


        }
        if(win.getDraw()){
            System.out.println("Draw");
        }else if (win.getPlayer2()){
            System.out.println(player2.playerName+" won the match");
        }else if(win.getPlayer1()){
            System.out.println(player1.playerName+" won the match");
        }
    }
}
