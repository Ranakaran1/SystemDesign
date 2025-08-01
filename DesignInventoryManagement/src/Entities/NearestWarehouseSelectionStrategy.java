package Entities;

import java.util.List;

public class NearestWarehouseSelectionStrategy extends WarehouseSelectionStrategy {

    @Override
    public Warehouse selectWarehouse(List<Warehouse> WarehouseList) {
        return WarehouseList.get(0);
        
    }
    
}
