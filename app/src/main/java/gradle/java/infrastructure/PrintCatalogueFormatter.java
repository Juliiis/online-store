package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;

public class PrintCatalogueFormatter {
  CatalogueFormatter catalogueFormatter = new CatalogueFormatter();

  public void printCatalogueAllProducts(ArrayList<Product> catalogue){
    String formattedCatalogue = catalogueFormatter.formatProductCatalogue(catalogue);
    System.out.println(formattedCatalogue);
  }

  public void printOneProductByReference(Product product){
    String formattedCatalogue = catalogueFormatter.formatProductByReference(product);
    System.out.println(formattedCatalogue);
  }

}
