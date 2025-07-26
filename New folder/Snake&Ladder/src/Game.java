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
        Player player1 = new Player(1, "Karan");
        Player player2 = new Player(2, "Rohan");
        players = new ArrayDeque<Player>();
        players.add(player1);
        players.add(player2);

    }

    public void startGame(){
        
    }
}
