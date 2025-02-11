// //to create board 
// char[][] board = new char[3][3]
//   //here your base board will be created


import java.util.*;
public class ticTacToe{
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int r = 0; r<board.length; r++){
            for(int c = 0; c<board.length; c++){
                board[r][c]= ' ';
            }
        }
        /*two  things upon which it will work the placement of zero and cross
        there will be 2 players player 1 can be zero or cross
        player 2 if(1==0) then cross ; else zero
       Q. how input it will take ?
       */
      char p1= 'X';
      boolean gameover = false;
      Scanner scanner = new Scanner(System.in);

      while(!gameover){
        printBoard(board);
        System.out.println("player" + p1 +"enter");
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        if(board[r][c] == ' '){
            //will place value
            board[r][c] = p1;
            gameover = haveWon(board,p1);
            if(gameover){
                System.out.println("player" + p1 +"has won: ");
            }else{
                if(p1 == 'X'){
                    p1 ='0';
                }else{
                    p1 = 'X';
                }
            }
        }
        else{
            System.out.println("invalid move");
        }
      }
    }

    public static boolean haveWon(char[][] board, char p1){
        for(int r = 0; r<board.length; r++){
            if(board[r][0] == p1 && board[r][1] == p1 && board[r][2] == p1){
                return true;
            }
        }
        for(int c = 0; c<board.length; c++){
            if(board[0][c] == p1 && board[1][c] == p1 && board[2][3] == p1){
                return true;
            }
        }
            if(board[0][0] == p1 && board[1][1] == p1 && board[2][2] == p1){
                return true;
            }
            if(board[0][2] == p1 && board[1][1] == p1 && board[2][0] == p1){
                return true;
            }
            return false;
    }
    public static void printBoard(char[][] board){
        for(int r = 0; r<board.length; r++){
            for(int c = 0; c<board.length; c++){
                System.out.println(board[r][c]+" | ");
            }
            System.out.println();
        }
    }
}
