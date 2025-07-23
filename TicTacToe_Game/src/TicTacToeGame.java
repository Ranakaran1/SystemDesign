import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.Pair;

public class TicTacToeGame {
    
    Deque<Player> players;
    Board gameBoard;

    public void initialize(){
        players = new LinkedList<>();
        PlayingPiece pieceX = new PlayingPieceX();
        PlayingPiece pieceO = new PlayingPieceO();
        Player player1 = new Player("Amit", pieceO);
        Player player2 = new Player("Rahul", pieceX);
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;

        while(noWinner){

            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            System.out.println("Player " + playerTurn.getName() + "'s turn, Enter Row,Col: ");

            List<Pair<Integer,Integer>> li =  gameBoard.getFreeCells();
            if(li.isEmpty()){
                noWinner = false;
                break;
            }

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] parts = s.split(",");
            int row = Integer.valueOf(parts[0]);;
            int col = Integer.valueOf(parts[1]);
            sc.close();

            boolean pieceAddedSuccesfully = gameBoard.addPiece(row, col, playerTurn.playingPiece);
            
            if(!pieceAddedSuccesfully){

                players.addFirst(playerTurn);
                System.out.println("Try again with correct Position");
                continue;
            }
            players.add(playerTurn);
            boolean winner = checkWinner( row, col, playerTurn.playingPiece);
            if(winner){
                return playerTurn.name;
            }

        }
        return "tie";


    }

    public boolean checkWinner(int row, int col, PlayingPiece playingPiece){

        boolean rowCheck = true;
        boolean colCheck = true;
        boolean clockDiagonal = true;
        boolean antiClockDiagonal = true;

        for(int i=0;i<3;i++){

            if(gameBoard.board[row][i]==null || gameBoard.board[row][i]!= playingPiece){
                rowCheck = false;
            }
            if(gameBoard.board[i][col]==null || gameBoard.board[i][col]!= playingPiece){
                colCheck = false;
            }
        }

        for(int i=0,j=0;i<3;i++,j++){
                if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!= playingPiece){
                    clockDiagonal = false;
                }
            }
        
        
        for(int i=0,j=2;i<3;i++,j--){
                if(gameBoard.board[i][j]==null || gameBoard.board[i][j]!= playingPiece){
                    antiClockDiagonal = false;
                }
            }

        return rowCheck || colCheck || clockDiagonal || antiClockDiagonal;
    }
}
