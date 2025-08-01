package Entities;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    List<Product> productList = new ArrayList<>() ;
    int productCategoryId;
    String categoryName;
    double price;

    public void addProduct(Product prd){
        productList.add(prd);
    }

    public void removeProduct(int count){
        for(int i=1;i<count;i++){
            productList.remove(0);
        }
    }

    //get the product

    public Product geProduct(int productId){

        for(Product prd : productList){
            if(prd.getProductId() == productId ){
                return prd;
            }
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

}
