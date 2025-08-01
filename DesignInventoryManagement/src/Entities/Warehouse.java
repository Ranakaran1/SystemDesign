package Entities;

import java.util.Map;

public class Warehouse {
    
    Address address;
    Inventory inventory;

    public void removeItemFromInventory(Map<Integer, Integer> productCartegoryAndCountMap){
        inventory.removeItem(productCartegoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap){
        // will make it.
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    
}

