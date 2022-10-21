package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Arrays;

public class ProductWarehouse {
    AllProductsAttributes allProductsAttributes = new AllProductsAttributes();
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

    public int findStockByReference(String productReference){ return 0; }

}
