package Entities;

public class Item1 extends Product {

    public Item1(int productId, double price, String name,ProductType productType){
        super(productId, price, name, productType);
    }

    @Override
    public double getPrice() {
        return price;
    }

    
}
