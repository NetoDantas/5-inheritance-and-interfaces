package inheritance.webshop;

import java.util.List;
import java.util.ArrayList;

public class WebShop {

    public List<Product> combineListsOfProducts(List<Product> mugs, List<Product> shirts,
            List<Vehicle> cars, List<Vehicle> bikes) {

        List<Product> products = new ArrayList<>();

        products.addAll(mugs);
        products.addAll(shirts);
        products.addAll(cars);
        products.addAll(bikes);

        return products;
    }

    public boolean isVehicle(Object obj) {
        return obj instanceof Vehicle;
    }

    public boolean isProduct(Object obj) {
        return obj != null && obj.getClass() == Product.class;
    }
}