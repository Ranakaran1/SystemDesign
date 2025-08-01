package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {

    List<Order> orderList;
    Map<Integer,List<Order>> userIDVsOrders;
    

    public OrderController(){
        orderList = new ArrayList<>();
        userIDVsOrders = new HashMap<>();
    }

    // create new Order
    public Order createNewOrder(User user, Warehouse warehouse) {
        Order order = new Order(user, warehouse);
        orderList.add(order);

        if(userIDVsOrders.containsKey(user.getUserID())){
            List<Order> ord = userIDVsOrders.get(user.getUserID());
            ord.add(order);
            userIDVsOrders.put(user.getUserID(), ord);
        }else {
            List<Order> ord = new ArrayList<>();
            ord.add(order);
            userIDVsOrders.put(user.getUserID(), ord);
        }
        return order;

    }

    //remove order
    public void removeOrder(Order order) {

    }

    public List<Order> getOrderByCustomerId(int userId){
        if(userIDVsOrders.containsKey(userId)){
            return userIDVsOrders.get(userId);
        }
        return null;
    }

    public Order getOrderByOrderId(int orderId){
        for(Order order : orderList){
            if(order.getOrderId()== orderId){
                return order;
            }
        }
        return null;
    }

}
