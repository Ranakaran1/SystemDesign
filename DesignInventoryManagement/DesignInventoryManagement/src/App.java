

import java.util.ArrayList;
import java.util.List;

import Entities.Address;
import Entities.Cart;
import Entities.Inventory;
import Entities.NearestWarehouseSelectionStrategy;
import Entities.Order;
import Entities.Product;
import Entities.ProductCategory;
import Entities.ProductDeliverySystem;
import Entities.User;
import Entities.Warehouse;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        App obj = new App();
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(obj.addWarehouseAndItsInventory());
    
        List<User> userList = new ArrayList<>();
        userList.add(obj.createUser());

        ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(userList, warehouseList);

        obj.runDeliveryFlow(productDeliverySystem, 1);

    }

    private void runDeliveryFlow(ProductDeliverySystem productDeliverySystem, int userId) {

        //1. Get the user object
        User user = productDeliverySystem.getUser(userId);

        // 2 . get warehouse based on user preference
        Warehouse warehouse =  productDeliverySystem.getWarehouse(new NearestWarehouseSelectionStrategy());

        //3. get all the Inventory to show the user

        Inventory inventory = productDeliverySystem.getInventory(warehouse);

        ProductCategory productCategoryUserOrdered = null;

        for(ProductCategory productCategory : inventory.getProductInventory()){
            if(productCategory.getCategoryName().equals("SoftDrink")){
                productCategoryUserOrdered = productCategory;
            }
        }

        // 4 add product to cart;
        productDeliverySystem.addProductToCart(user, productCategoryUserOrdered, 2);
        // 5 place order
        Order order = productDeliverySystem.plaOrder(user, warehouse);
        // 6 checkout
        productDeliverySystem.checkout(order);

        


    }

    private Warehouse addWarehouseAndItsInventory(){
        Product product1 = new Product();
        product1.setProductId(1);
        product1.setProductName("pepsii");

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setProductName("Coke");

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setProductName("Dove");

        Inventory inventory = new Inventory();
        inventory.addCategory(1, "SoftDrink", 10);
        inventory.addCategory(2, "Soap", 20);

        inventory.addProduct(product1, 1);
        inventory.addProduct(product2, 2);
        inventory.addProduct(product3, 2);

        Warehouse warehouse = new Warehouse();
        warehouse.setInventory(inventory);
        return warehouse;

    }

    private User createUser(){
        User user = new User();
        user.setUserID(1);
        Address address = new Address(203001, "Bulandshahr", "UP");
        user.setAddress(address);
        user.setUserName("Ayush");
        Cart cart = new Cart();
        user.setCart(cart);
        return user;
    }

}
