package Entities;

public class PercentageCoupanDecorator extends Decorator{
    Product product;
    double percentage;
    
    public PercentageCoupanDecorator(Product product, double percentage) {
        this.product = product;
        this.percentage = percentage;
    }

    @Override
    public double getPrice() {
        // System.out.println(product.getProductType());
        double price = product.getPrice();
        return price - (price * percentage / 100);
    }

    public ProductType getProductType(){
        return product.getProductType();
    }
    
}
