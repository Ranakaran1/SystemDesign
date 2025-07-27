import Entitys.Coin;
import Entitys.Item;
import Entitys.ItemShelf;
import Entitys.ItemType;
import Entitys.VendingMachine;
import VendingStates.State;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        VendingMachine vendingMachine = new VendingMachine();

        try{
            System.out.println("filling the Inventory");
            fillInventory(vendingMachine);
            displayInventory(vendingMachine);

            State state = vendingMachine.getVendingMachineState();
            state.clickOnInsertCoinButton(vendingMachine);
            state = vendingMachine.getVendingMachineState();
            state.insertCoin(vendingMachine, Coin.NICKEL);
            state.insertCoin(vendingMachine, Coin.DIME);

            System.out.println("Click on product selection button");
            state.clickOnStartProductSelectionButton(vendingMachine);

            state = vendingMachine.getVendingMachineState();

            state.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);


        } catch(Exception e){
            System.out.println(e.toString());
        }
    }

    private static void fillInventory(VendingMachine vendingMachine) {
        ItemShelf[] shelfs = vendingMachine.getInventry().getInventory();

        for(int i=0;i<shelfs.length;i++){
            Item newItem = new Item();
            if(i>=0 && i<3){
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i>=3 && i<6){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(12);
            }else if(i>=6 && i<9){
                newItem.setType(ItemType.WATER);
                newItem.setPrice(12);
            } else{
                newItem.setType(ItemType.SODA);
                newItem.setPrice(10);
            }


            shelfs[i].setItem(newItem);
            shelfs[i].setSoldOut(false);

        }

        
    }

    public static void displayInventory(VendingMachine vMachine){
        ItemShelf[] shelfs = vMachine.getInventry().getInventory();

        for(int i=0;i<shelfs.length;i++){
            System.out.println("CodeNumber: "+ shelfs[i].getCode() 
            + " Item: " + shelfs[i].getItem().getType().name()
            + " Price: " + shelfs[i].getItem().getPrice()
            + " Stock available: " + !shelfs[i].isSoldOut()
            );
        }
    }
    
}
