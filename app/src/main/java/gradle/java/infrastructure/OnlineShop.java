package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;

public class OnlineShop {
    private CatalogueFormatter catalogueFormater = new CatalogueFormatter();
    private final ProductWarehouse productWarehouse = new ProductWarehouse();

    public void showProducts() {

        ArrayList<Product> catalogue = productWarehouse.findAll();
        String formattedCatalogue = catalogueFormater.format(catalogue);
        System.out.println(formattedCatalogue);
    }
}