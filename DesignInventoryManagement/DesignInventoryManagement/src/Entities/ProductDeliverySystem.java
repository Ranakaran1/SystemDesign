package Entities;

import java.util.List;

public class ProductDeliverySystem {
    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    public ProductDeliverySystem(List<User> userList, List<Warehouse> warehouseList) {
        userController = new UserController(userList);
        warehouseController = new WarehouseController(warehouseList, null);
        orderController = new OrderController();

    }

    public User getUser(int userId){
        return userController.getUser(userId);
    }

    // get warehouse
    public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy){
        return warehouseController.selectWarehouse(warehouseSelectionStrategy);

    }

    public Inventory getInventory(Warehouse warehouse){
        return warehouse.getInventory();
    }

    // add product to cart
    public void addProductToCart(User user, ProductCategory productCategory, int count){
        Cart cart = user.getCart();
        cart.addItem(productCategory.productCategoryId, count);
    }

    public Order plaOrder(User user, Warehouse warehouse){
        return orderController.createNewOrder(user, warehouse);
    }

    public void checkout(Order order){
        order.checkout();
    }

    
    
}
