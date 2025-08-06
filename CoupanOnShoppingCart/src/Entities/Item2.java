package Entities;

public class Item2 extends Product {
    public Item2(int productId, double price, String name,ProductType productType){
        super(productId, price, name, productType);
    }

    @Override
    public double getPrice() {
        return price;
    }

}
