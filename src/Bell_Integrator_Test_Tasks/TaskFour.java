package Bell_Integrator_Test_Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFour {}


class OnlineStoreShoppingСart implements Basket {
    private Map<String, Integer> products = new HashMap();

    public void addProduct(String product, int quantity){
        if(quantity <= 0) {
            System.out.println("Данное количнство товара не может быть добавлено в корзину");
        }
        else {
            products.put(product, quantity);
        }
    }

    public void removeProduct(String product){
        products.remove(product);
    }

    public void updateProductQuantity(String product, int quantity){
        if(product.contains(product)) {
            if(quantity <= 0) {
                products.remove(product);
            }
            else{
                products.put(product, quantity);
            }
        }
        else {
            System.out.println("В корзине нет данного продукта");
        }
    }

    public void clear(){
        products.clear();
    }

    public List<String> getProducts(){
        ArrayList<String> list = new ArrayList<>(products.keySet());
        return list;
    }

    public int getProductsQuantity(String product){
        return products.getOrDefault(product,0);
    }
}


interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantuty);
    void clear();
    List<String> getProducts();
    int getProductsQuantity(String product);
}

