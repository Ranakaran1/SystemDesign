package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    List<ProductCategory> li;
    public Inventory() {
        li = new ArrayList<>();
    }

    public void addCategory(int categoryId, String name, int price){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName(name);
        productCategory.setProductCategoryId(categoryId);
        productCategory.setPrice(price);
        li.add(productCategory);
    }

    // add product to the particular inventory

    public void addProduct(Product Product , int productCategoryId){
        ProductCategory productCategory= null;
        for(ProductCategory pc : li){
            if(pc.getProductCategoryId()== productCategoryId){
                productCategory = pc;
                
            }
        }
        if(productCategory!=null){
            productCategory.addProduct(Product);
            System.out.println("Product added successfully to category");
        }

    }


    public void removeItem(Map<Integer,Integer> productCategoryAndCountMap){
        for (Map.Entry<Integer,Integer> entry : productCategoryAndCountMap.entrySet()){
            ProductCategory prd = getProductCategoryFromId(entry.getKey());
            prd.removeProduct(entry.getValue());
        }
    }

    private ProductCategory getProductCategoryFromId(int productCategoryId){
        ProductCategory productCategory= null;
        for(ProductCategory pc : li){
            if(pc.getProductCategoryId()== productCategoryId){
                productCategory = pc;
            }
        }
        return productCategory;
    }

    public List<ProductCategory>  getProductInventory(){
        return li;
    }


}
