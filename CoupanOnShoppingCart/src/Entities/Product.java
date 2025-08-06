package Entities;

public abstract class Product {
    int productId;
    double price;
    String name;

    ProductType productType;

    public Product() {
    }

    public Product(int productId, double price, String name,ProductType productType) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.productType = productType;
    }

    public abstract double getPrice();

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    

    


}
