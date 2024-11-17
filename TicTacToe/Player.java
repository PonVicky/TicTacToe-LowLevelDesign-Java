package TicTacToe;

public class Player {

     String playerName;
     int playerId;
     char symbol;
    private static int id  = 1;
    public Player(String playerName, char symbol ){
        this.playerName = playerName;
        this.playerId = id++;
        this.symbol = symbol;
    }




}
