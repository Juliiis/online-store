package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;


public class CatalogueFormatter {
    public String format(ArrayList<Product> catalogue){
        StringBuilder formattedProduct = new StringBuilder();
        for (Product product : catalogue){
            formattedProduct.append(product.showImage());
            formattedProduct.append("\n");
            formattedProduct.append(product.showDescription());
            formattedProduct.append("\n");
            formattedProduct.append(product.showFeaturedAttribute());
            formattedProduct.append("\n");
            formattedProduct.append(product.showPrice());
            formattedProduct.append("\n");
            formattedProduct.append(product.showReference());
            formattedProduct.append("\n");
            formattedProduct.append("\n");
        }
        return formattedProduct.toString();
    }


}
