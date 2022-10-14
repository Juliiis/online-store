package gradle.java.infrastructure;

import gradle.java.domain.Product;
import java.util.ArrayList;
import java.util.Scanner;


public class CatalogueFormater {
    ProductsToChooseExplore productsToChooseExplore = new ProductsToChooseExplore();
    DecideStepToContinue decideStepToContinue = new DecideStepToContinue();
    public String format(ArrayList<Product> catalogue){
        for (Product product : catalogue){
            System.out.println(product.showImage());
            System.out.println(product.showDescription());
            System.out.println(product.showFeaturedAttribute());
            System.out.println(product.showPrice());
            System.out.println(product.showReference());
            System.out.println("\n");
        }
        productsToChooseExplore.productsToChooseExplore();
        decideStepToContinue.decideWhatToDoNext();
        return "";
    }


}
