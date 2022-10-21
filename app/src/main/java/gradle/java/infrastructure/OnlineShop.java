package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    private final ProductWarehouse productWarehouse = new ProductWarehouse();
    PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
    public void showProducts() {
        ArrayList<Product> catalogue = productWarehouse.findAll();
        printCatalogueFormatter.printCatalogue(catalogue);
    }
    public void showProductByReference(){
        Scanner myObj = new Scanner(System.in);
        String object = myObj.nextLine();
        Product product = productWarehouse.findProductByReference(object);
        printCatalogueFormatter.printByReference(product);
    }
}
