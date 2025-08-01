package Entities;

import java.util.Map;

public class Order {
    int orderId;
    User user;
    Map<Integer, Integer> productCategoryAndCountMap;
    Warehouse warehouse;
    Invoice invoice;
    Payment payment;
    OrderStatus orderStatus;
    Address deliveryAddress;
    public Order(User user, Warehouse warehouse){
        this.user = user;
        this.warehouse = warehouse;
        this.productCategoryAndCountMap = user.getCart().getCart();
        this.deliveryAddress = user.getAddress();
        invoice = new Invoice();
        invoice.generateInvoice(this);
    }

    public int getOrderId(){
        return this.orderId;
    }

    public void checkout(){
        // updating the inventory
        System.out.println("Came here successfully");
        System.out.println(productCategoryAndCountMap);
        warehouse.removeItemFromInventory(productCategoryAndCountMap);

        // make payment
        boolean isPaymentSuccessful = makePayment(new CardPayment());

        if(isPaymentSuccessful){
            user.getCart().emptyCart();
        }else{
            warehouse.addItemToInventory(productCategoryAndCountMap);
        }
    }

    public boolean makePayment(PaymentMode payment){
        Payment payment_ = new Payment(payment);
        return payment_.makePayment();
    }

    public void generateInvoice(){
        invoice.generateInvoice(this);
    }

    
}
