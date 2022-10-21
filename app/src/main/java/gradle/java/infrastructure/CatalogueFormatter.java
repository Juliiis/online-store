package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;


public class CatalogueFormatter {
    public String formatProductCatalogue(ArrayList<Product> catalogue){
        StringBuilder formattedProduct = new StringBuilder();
        for (Product product : catalogue){
            formattedProduct.append(product.showImage());
            formattedProduct.append("\n");
            formattedProduct.append(product.showShortDescription() + " " + product.showHighLightedAttribute());
            formattedProduct.append("\n");
            formattedProduct.append(product.showLongDescription());
            formattedProduct.append("\n");
            formattedProduct.append(product.showPrice());
            formattedProduct.append("\n");
            formattedProduct.append(product.showReference());
            formattedProduct.append("\n");
            formattedProduct.append("\n");
        }
        return formattedProduct.toString();
    }

    public String formatProductByReference(Product product){
        StringBuilder formattedProduct = new StringBuilder();
            formattedProduct.append(product.showImage());
            formattedProduct.append("\n");
            formattedProduct.append(product.showPrice());
            formattedProduct.append("\n");
            formattedProduct.append(product.showReference());
            formattedProduct.append("\n");
            formattedProduct.append(product.showShortDescription() + " " + product.showHighLightedAttribute());
            formattedProduct.append("\n");
            formattedProduct.append(product.showLongDescription());
            formattedProduct.append("\n");
            formattedProduct.append("\n");

        return formattedProduct.toString();
    }


}
