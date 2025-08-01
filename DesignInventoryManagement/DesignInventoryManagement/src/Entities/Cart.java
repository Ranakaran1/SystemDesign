package Entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Integer, Integer> productCategoryIdVsCountMap;

    public Cart() {
        productCategoryIdVsCountMap = new HashMap<>();
    }

    // add item to the cart
    public void addItem(int productId, int quantity) {
        if(productCategoryIdVsCountMap.containsKey(productId)){
            int count = productCategoryIdVsCountMap.get(productId);
            productCategoryIdVsCountMap.put(productId, count + quantity);
            System.out.println("Product added successfully to map productCategoryIdVsCountMap");
        }else{
            productCategoryIdVsCountMap.put(productId, quantity);
            System.out.println("Product added successfully to map productCategoryIdVsCountMap");
        }
    }

    //remove item form cart
    public void removeItem(int productId, int count) {
        if(productCategoryIdVsCountMap.containsKey(productId)){
            int exist = productCategoryIdVsCountMap.get(productId);
            if(exist -count ==0){
                productCategoryIdVsCountMap.remove(productId);
            }else{
                productCategoryIdVsCountMap.put(productId, exist - count);
            }
        }
    }

    // empty the cart
    public void emptyCart() {
        productCategoryIdVsCountMap = new HashMap<>();
    }

    //view cart

    public Map<Integer,Integer>  getCart(){
        return productCategoryIdVsCountMap;
    }

    

    
}
