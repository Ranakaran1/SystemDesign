public class Dice {
    int diceCount;
    int mini =1;
    int maxi = 6;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){

        int totalSum =0;

        for(int i=0;i<diceCount;i++){
            int random = (int)(Math.random()*6)+1;
            totalSum += random;
        }
        return totalSum;                                                                      
    }
}
