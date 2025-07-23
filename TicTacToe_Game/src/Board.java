import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;


public class Board {

    public int size;

    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]!=null){
                    System.out.print(board[i][j].pieceType.name());
                    
                }else {
                    System.out.print("  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    freeCells.add(new Pair<>(i,j));
                }
            }
        }

        return freeCells;


    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(row<0 || row>=size || col<0 || col>=size){
            return false;
        }
        if(board[row][col]==null){
            board[row][col] = playingPiece;
            return true;
        }
        return false;

    }

    
}
