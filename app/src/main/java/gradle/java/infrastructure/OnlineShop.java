package gradle.java.infrastructure;

import gradle.java.domain.Product;
import gradle.java.infrastructure.interfaces.CliInterface;
import java.util.ArrayList;

public class OnlineShop {
    private final ProductWarehouse productWarehouse;
    private final PrintCatalogueFormatter printCatalogueFormatter;
    private final CliInterface cli;

    public OnlineShop(ProductWarehouse productWarehouse, PrintCatalogueFormatter printCatalogueFormatter, CliInterface cli) {
        this.productWarehouse = productWarehouse;
        this.printCatalogueFormatter = printCatalogueFormatter;
        this.cli = cli;
    }

    public void showProducts() {
        ArrayList<Product> catalogue = productWarehouse.findAll();
        printCatalogueFormatter.printCatalogueAllProducts(catalogue);
    }
    public void showProductByReference(){
        String inputClient = cli.getInputFromUser();
        Product product = productWarehouse.findProductByReference(inputClient);
        printCatalogueFormatter.printOneProductByReference(product);
    }

}
