package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductWarehouse {
    GlobalVariables globalVariables = new GlobalVariables();
    private final ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product(
                    "\uD83D\uDCFA",
                    "Glamorous panoramic television, 13 inches",
                    "With this panoramic television, your friday nights will be boring no more.",
                    "Price: 300.99 €",
                    "Reference: W2C"),
            new Product(
                    "\uD83C\uDFB9",
                    "Untuned musical keyboard, 4 octaves",
                    "Tired of your noisy neighbourgh? Play this untuned musical keyboard for two hours at home and your neighbour will be ready to move to a building far away from you.",
                    "Price: 1003.00 €",
                    "Reference: X4A")));

    public ArrayList<Product> findAll() {
        return products;
    }

    public Product findTheProductByAllReference(){
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
