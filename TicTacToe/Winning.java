package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Winning extends Board{
    static int won = 0;


    private boolean player1 = false;
    private boolean player2 = false;
    private boolean draw  = false;

    List<Integer> player1Position = new ArrayList<>();
    List<Integer> player2Position = new ArrayList<>();

    public boolean checkWinner(){
        List<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> row2 = new ArrayList<>(Arrays.asList(4,5,6));
        List<Integer> row3 = new ArrayList<>(Arrays.asList(7,8,9));
        List<Integer> col1 = new ArrayList<>(Arrays.asList(1,4,7));
        List<Integer> col2 = new ArrayList<>(Arrays.asList(2,5,8));
        List<Integer> col3 = new ArrayList<>(Arrays.asList(3,6,9));
        List<Integer> cross1 = new ArrayList<>(Arrays.asList(1,5,9));
        List<Integer> cross2 = new ArrayList<>(Arrays.asList(3,5,7));

        List<List> possibleWinningPositions = new ArrayList<>();
        possibleWinningPositions.add(row1);
        possibleWinningPositions.add(row2);
        possibleWinningPositions.add(row3);
        possibleWinningPositions.add(col1);
        possibleWinningPositions.add(col2);
        possibleWinningPositions.add(col3);
        possibleWinningPositions.add(cross1);
        possibleWinningPositions.add(cross2);


        for(List l : possibleWinningPositions){
            if(player1Position.containsAll(l)){
                player1 = true;
                won = 1;
                return false;
            }else if(player2Position.containsAll(l)){
                player2 = true;
                won = 1;
                return false;
            }else if(player1Position.size() + player2Position.size() == 9){
                draw = true;
                won = 1;
                return false;
            }
        }
        return true;
    }




    public boolean getPlayer1() {
        return player1;
    }

    public boolean getPlayer2() {
        return player2;
    }

    public boolean getDraw() {
        return draw;
    }



}
