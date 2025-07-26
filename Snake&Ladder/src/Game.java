import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players;
    Player winner;

    public Game(){
        initializeGame();
    }

    private void initializeGame(){
        board = new Board(10, 5, 6);
        dice = new Dice(1);
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player(1, "Karan",0);
        Player player2 = new Player(2, "Rohan",0);
        players = new ArrayDeque<Player>();
        players.add(player1);
        players.add(player2);

    }

    public void startGame(){
        while(winner==null){
            Player playerTurn = findPlayer();
            System.out.println("player turn is: " + playerTurn.getName() + " current position is: " + playerTurn.currentPosition);

            int diceNumber = dice.rollDice();

            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            if(playerNewPosition >= board.cells.length * board.cells.length -1){
                winner = playerTurn;
            }
        }
        System.out.println("Winner is: "+ winner.getName());
    }

    private Player findPlayer(){
        Player player = players.pollFirst();
        players.addLast(player);
        return player;
    }

    private int jumpCheck(int playerNewPosition){
        if(playerNewPosition > board.cells.length * board.cells.length -1){
            return playerNewPosition;
        }

        Cells cells = board.getCell(playerNewPosition);
        if(cells.jump!=null && cells.jump.start == playerNewPosition){
            if(cells.jump.end < playerNewPosition){
                System.out.println("Snake: to " + cells.jump.end);
            }else {
                System.out.println("Ladder to " + cells.jump.end);
            }

            playerNewPosition = cells.jump.end;
        }
        return playerNewPosition;
    }
}
