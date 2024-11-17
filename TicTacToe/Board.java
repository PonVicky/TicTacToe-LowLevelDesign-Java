package TicTacToe;

public class Board {

    static char[][] board = {{'-',' ','-',' ','-'},{'-',' ','-',' ','-'},{'-',' ','-',' ','-'}};

    public boolean checkPosition(int position){
        switch (position){
            case 1:{
                if(board[0][0] !='-'){
                    return true;
                }
                break;
            }
            case 2:{
                if(board[0][2] !='-'){
                    return true;
                }
                break;
            }case 3:{
                if(board[0][4] !='-'){
                    return true;
                }
                break;
            }case 4:{
                if(board[1][0] !='-'){
                    return true;
                }
                break;
            }case 5:{
                if(board[1][2] !='-'){
                    return true;
                }
                break;
            }case 6:{
                if(board[1][4] !='-'){
                    return true;
                }
                break;
            }case 7:{
                if(board[2][0] !='-'){
                    return true;
                }
                break;
            }
            case 8:{
                if(board[2][2]!='-'){
                    return true;
                }
                break;
            }
            case 9:{
                if(board[2][4] !='-'){
                    return true;
                }
                break;
            }

        }
        return false;
    }

    public void setPosition(int position,char symbol){
        if(position >= 9){
            System.out.println("Invalid position");
        }

        switch (position){
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[1][0] = symbol;
                break;
            case 5:
                board[1][2] = symbol;
                break;
            case 6:
                board[1][4] = symbol;
                break;
            case 7:
                board[2][0] = symbol;
                break;
            case 8:
                board[2][2] = symbol;
                break;
            case 9:
                board[2][4] = symbol;
                break;
        }
    }


    public void printBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
