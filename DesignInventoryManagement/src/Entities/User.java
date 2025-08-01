package Entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    int userID;
    String userName;
    Address address;
    Cart cart;
    List<Integer> orderIds;
    public User() {
        this.cart = new Cart();
        this.orderIds = new ArrayList<>();

    }

    // get UserCart
    public Cart getCart() {
        return cart;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    


    
}
