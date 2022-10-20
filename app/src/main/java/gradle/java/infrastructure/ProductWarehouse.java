package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductWarehouse {
    GlobalVariables globalVariables = new GlobalVariables();
    AllProductsAttributes allProductsAttributes = new AllProductsAttributes();
    private final ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product(
                    allProductsAttributes.TV_IMAGE,
                    allProductsAttributes.TV_SHORT_DESCRIPTION,
                    allProductsAttributes.TV_HIGHLIGHTED_ATTRIBUTE,
                    allProductsAttributes.TV_LONG_DESCRIPTION,
                    allProductsAttributes.TV_PRICE,
                    allProductsAttributes.TV_REFERENCE,
                    allProductsAttributes.TV_STOCK),
            new Product(
                    allProductsAttributes.PIANO_IMAGE,
                    allProductsAttributes.PIANO_SHORT_DESCRIPTION,
                    allProductsAttributes.PIANO_HIGHLIGHTED_ATTRIBUTE,
                    allProductsAttributes.PIANO_LONG_DESCRIPTION,
                    allProductsAttributes.PIANO_PRICE,
                    allProductsAttributes.PIANO_REFERENCE,
                    allProductsAttributes.PIANO_STOCK)));

    public ArrayList<Product> findAll() {
        return products;
    }

    public Product displayASpecificProduct(){
        Scanner myObj = new Scanner(System.in);

        String object = myObj.nextLine();

        for(Product product : products){
            if (object.equals("1")){
                System.out.println(product.showImage());
                System.out.println(product.showPrice());
                System.out.println(product.showReference());
                System.out.println(product.showDescription());
                System.out.println(product.showFeaturedAttribute());
                System.out.println("\n");
            }
            return product;
        }
        throw new RuntimeException(globalVariables.PRODUCT_DOES_NOT_EXIST);
    }

}
