package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;

public class OnlineShop {
    private final ProductWarehouse productWarehouse = new ProductWarehouse();
    PrintCatalogueFormatter printCatalogueFormatter = new PrintCatalogueFormatter();
    ScannerInput scannerInput = new ScannerInput();
    public void showProducts() {
        ArrayList<Product> catalogue = productWarehouse.findAll();
        printCatalogueFormatter.printCatalogue(catalogue);
    }
    public void showProductByReference(){
        String inputClient = scannerInput.getInputFromUser();
        Product product = productWarehouse.findProductByReference(inputClient);
        printCatalogueFormatter.printByReference(product);
    }

}
