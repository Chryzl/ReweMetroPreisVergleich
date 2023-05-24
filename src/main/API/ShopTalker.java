package API;

import Utils.Product;

import java.util.ArrayList;

public abstract class ShopTalker {
    public abstract ArrayList<Product> getProductsByQuery(String query);
}
