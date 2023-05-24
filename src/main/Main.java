import API.MetroTalker;
import API.ReweTalker;
import API.ShopTalker;
import Utils.Product;
import Utils.ProductComparator;

import java.util.ArrayList;

public class Main {

    public  static void main(String[] args) {
        String query = "";
        try {
            query = args[0];
        } catch (Exception e) {
            System.out.println("[ERROR] Please provide a search query as the parameter");
            System.exit(1);
        }

        System.out.format("Searching for: %s\n", query);

        ProductComparator comparator = new ProductComparator();
        ShopTalker metroTalker = new MetroTalker();
        ShopTalker reweTalker = new ReweTalker();

        ArrayList<Product> results = comparator.filterProductLists(reweTalker.getProductsByQuery(query), metroTalker.getProductsByQuery(query));
    }
}
