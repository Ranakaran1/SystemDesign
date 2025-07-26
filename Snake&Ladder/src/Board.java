import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cells[][] cells ;
    int rows , cols ;
    public Board(int boardSize, int snakes, int ladders) {
        initialize(boardSize);
        addSnakesLadders(cells, snakes, ladders);
    }

    private void initialize(int boardSize){
        cells = new Cells[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cells[i][j] = new Cells();

            }
        }

    }

    private void addSnakesLadders(Cells[][] cells,int snakes, int ladders){

        while(snakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length -1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length -1);
            if(snakeHead <= snakeTail){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cells cell = getCell(snakeHead);
            cell.jump = snakeObj;
            snakes--;
        }

        while(ladders>0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length -1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length -1);
            if(ladderHead <= ladderTail){
                continue;
            }
            Jump ladderObj = new Jump();
            ladderObj.start = ladderHead;
            ladderObj.end = ladderTail;

            Cells cell = getCell(ladderHead);
            cell.jump = ladderObj;
            ladders--;
        }
    }

    public Cells getCell(int playerPosition){
        int rowPos = playerPosition/cells.length;
        int colPos = playerPosition%cells.length;
        return cells[rowPos][colPos];
    }
    
}
