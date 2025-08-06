package Entities;

import java.util.ArrayList;
import java.util.List;

public class TypeCoupanDecorator extends Decorator{

    Product product;
    double percentage;
    ProductType productType;
    static List<ProductType> eligibleList= new ArrayList<>();
    static{
        eligibleList.add(ProductType.FURNITURE_GOODS);
        eligibleList.add(ProductType.ELECTRONICS);
    }
    
    public TypeCoupanDecorator(Product product, double percentage) {
        this.product = product;
        this.percentage = percentage;
    }

    @Override
    public double getPrice() {
        double price = product.getPrice();
        // System.out.println(product.getProductType());
        if(eligibleList.contains(product.getProductType())){
            return price - (price * percentage / 100);
        }
        return price;
    }

    public ProductType getProductType(){
        return product.getProductType();
    }
}
