public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TicTacToeGame game = new TicTacToeGame();
        game.initialize();
        System.out.println(game.startGame());
    }
}
