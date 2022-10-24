package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;

public class OnlineShop {
    private final ProductWarehouse productWarehouse;
    private final PrintCatalogueFormatter printCatalogueFormatter;
    private final ScannerInput scannerInput;

    public OnlineShop(ProductWarehouse productWarehouse, PrintCatalogueFormatter printCatalogueFormatter, ScannerInput scannerInput) {
        this.productWarehouse = productWarehouse;
        this.printCatalogueFormatter = printCatalogueFormatter;
        this.scannerInput = scannerInput;
    }

    public void showProducts() {
        ArrayList<Product> catalogue = productWarehouse.findAll();
        printCatalogueFormatter.printCatalogueAllProducts(catalogue);
    }
    public void showProductByReference(){
        String inputClient = scannerInput.getInputFromUser();
        Product product = productWarehouse.findProductByReference(inputClient);
        printCatalogueFormatter.printOneProductByReference(product);
    }

}
