package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductWarehouse {
    AllProductsAttributes allProductsAttributes = new AllProductsAttributes();
    GlobalVariables globalVariables = new GlobalVariables();
    private final ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product(
                    allProductsAttributes.TV_IMAGE,
                    allProductsAttributes.TV_SHORT_DESCRIPTION,
                    allProductsAttributes.TV_HIGHLIGHTED_ATTRIBUTE,
                    allProductsAttributes.TV_LONG_DESCRIPTION,
                    allProductsAttributes.TV_PRICE,
                    allProductsAttributes.TV_REFERENCE),
            new Product(
                    allProductsAttributes.PIANO_IMAGE,
                    allProductsAttributes.PIANO_SHORT_DESCRIPTION,
                    allProductsAttributes.PIANO_HIGHLIGHTED_ATTRIBUTE,
                    allProductsAttributes.PIANO_LONG_DESCRIPTION,
                    allProductsAttributes.PIANO_PRICE,
                    allProductsAttributes.PIANO_REFERENCE)));

    public ArrayList<Product> findAll() {
        return products;
    }

    public Product findProductByReference(String productReference){
        for (Product product : products) {
            if (product.reference.contains(productReference)) {
                return product;
            }
        }
        throw new RuntimeException(globalVariables.PRODUCT_DOES_NOT_EXIST);

    }

}
