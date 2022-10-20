package gradle.java.infrastructure;

import gradle.java.domain.Product;
import gradle.java.infrastructure.CatalogueFormater;
import gradle.java.infrastructure.ProductWarehouse;
import java.util.ArrayList;

public class OnlineShop {
    private CatalogueFormater catalogueFormater = new CatalogueFormater();
    private final ProductWarehouse productWarehouse = new ProductWarehouse();

    public void showProducts() {

        ArrayList<Product> catalogue = productWarehouse.findAll();
        String formattedCatalogue = catalogueFormater.format(catalogue);
        System.out.println(formattedCatalogue);
    }
}