package Entitys;
public class Inventry {

    ItemShelf[] inventory = null;

    public Inventry(int size){
        inventory = new ItemShelf[size];
        initialize();
    }
    public void initialize(){

        int startCode= 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode+i);
            space.setSoldOut(true);
            inventory[i] = space;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf shelf: inventory){
            if(shelf.getCode() == codeNumber){
                shelf.setSoldOut(false);
                shelf.setItem(item);
            } else{
                throw new Exception("Code not found");
            }
        }
    }

    public Item getItem(int code) throws Exception{

        for(ItemShelf itemShelf :  inventory){
            if(itemShelf.getCode() == code){
                if(itemShelf.isSoldOut()){
                    throw new Exception("Item has sold out");

                }else{
                    return itemShelf.getItem();
                }
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOut(int code){
        for(ItemShelf shelf: inventory){
            if(shelf.getCode() == code){
                shelf.setSoldOut(true);
            }
        }
    }
    public ItemShelf[] getInventory() {
        return inventory;
    }
    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }

    


    
}
